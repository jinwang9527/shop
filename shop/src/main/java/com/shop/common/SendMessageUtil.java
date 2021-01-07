package com.shop.common;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.sms.v20190711.SmsClient;
import com.tencentcloudapi.sms.v20190711.models.SendSmsRequest;
import com.tencentcloudapi.sms.v20190711.models.SendSmsResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service("sendMessageUtil")
public class SendMessageUtil {


    @Value("${secretId}")
    private String secretId;

    @Value("${secretKey}")
    private String secretKey;

    @Value("${sDKAppID}")
    private String appid;

    @Value("${sign}")
    private String sign;


    /**
     * 单发短信
     *
     * @param phone
     * @param templateID
     * @param param
     * @return
     * @throws Exception
     */
    public SendSmsResponse getCredential(String phone, String templateID, String... param) throws Exception {
        List<String> phones = new ArrayList<>();
        phones.add(phone);
        return this.getCredential(phones, templateID, param);
    }

    public SendSmsResponse getCredential(List<String> phone, String templateID, String... param) throws Exception {
        Credential cred = new Credential(secretId, secretKey);
        SmsClient client = new SmsClient(cred, "");
        SendSmsRequest req = new SendSmsRequest();
        req.setSmsSdkAppid(appid);
        req.setSign(sign);
        req.setSenderId("");
        log.info("短信模板id：[{}]", templateID);
        req.setTemplateID(templateID);
        if (phone.size() == 0) throw new Exception("发送短信的手机号码为空！");
        String[] phoneNumbers = phone.stream().toArray(String[]::new);
        log.info("发送短信手机号：[{}]", phoneNumbers);
        req.setPhoneNumberSet(phoneNumbers);
        log.info("发送短信参数：[{}]", param);
        req.setTemplateParamSet(param);
        SendSmsResponse res = client.SendSms(req);
        log.info("短信发送结果：[{}]", SendSmsResponse.toJsonString(res));
        return res;
    }

}
