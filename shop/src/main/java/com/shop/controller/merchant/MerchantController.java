package com.shop.controller.merchant;


import com.shop.result.util.ResultModel;
import com.shop.service.merchant.MerchantService;
import com.shop.vo.AddMerchantVo;
import com.shop.vo.MerchantAddShelfVo;
import com.shop.vo.UpdateMerchantVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("merchant")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;


    @ResponseBody
    @RequestMapping("addMerchant")
    public ResultModel addMerchant(@RequestBody AddMerchantVo addMerchantVo)throws Exception{
        return merchantService.addMerchant(addMerchantVo);
    }

    @ResponseBody
    @RequestMapping("updateMerchant")
    public ResultModel updateMerchant(@RequestBody UpdateMerchantVo updateMerchantVo)throws Exception{
        return merchantService.updateMerchant(updateMerchantVo);
    }

    @ResponseBody
    @RequestMapping("merchantAddShelf")
    public ResultModel merchantAddShelf(@RequestBody MerchantAddShelfVo merchantAddShelfVo)throws Exception{
        return merchantService.merchantAddShelf(merchantAddShelfVo);
    }


}
