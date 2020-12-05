package com.shop.service.merchant;

import com.shop.result.util.ResultModel;
import com.shop.vo.AddMerchantVo;
import com.shop.vo.MerchantAddShelfVo;
import com.shop.vo.UpdateMerchantVo;

public interface MerchantService {

    /**
     * 添加商铺
     * @param addMerchantVo
     * @return
     */
    ResultModel addMerchant(AddMerchantVo addMerchantVo)throws Exception;

    /**
     * 修改商铺
     * @param updateMerchantVo
     * @return
     */
    ResultModel updateMerchant(UpdateMerchantVo updateMerchantVo)throws Exception;

    /**
     * 商铺上架商品
     * @param merchantAddShelfVo
     * @return
     */
    ResultModel merchantAddShelf(MerchantAddShelfVo merchantAddShelfVo)throws Exception;
}
