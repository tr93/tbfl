package com.tencent.wxcloudrun.utils;
import com.alibaba.fastjson.JSON;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import com.taobao.top.TopApiClient;
import com.taobao.top.DefaultTopApiClient;
import com.taobao.top.TopFileItem;
import com.taobao.top.defaultability.Defaultability;
import com.taobao.top.defaultability.request.TaobaoTbkDgGeneralLinkConvertRequest;
import com.taobao.top.defaultability.response.TaobaoTbkDgGeneralLinkConvertResponse;
import com.taobao.top.defaultability.domain.TaobaoTbkDgGeneralLinkConvertTargetItemDTO;
import com.taobao.top.defaultability.domain.TaobaoTbkDgGeneralLinkConvertLkItemDTO;
import com.taobao.top.defaultability.domain.TaobaoTbkDgGeneralLinkConvertLkPageDTO;
import com.taobao.top.defaultability.domain.TaobaoTbkDgGeneralLinkConvertLkShopDTO;
import com.taobao.top.defaultability.domain.TaobaoTbkDgGeneralLinkConvertLkMaterialDTO;

public class TestPost {





        public static void main(String[] args) throws Exception {
            TopApiClient client = new DefaultTopApiClient("<your-appkey>","<your-appsecret>","<top-gateway-url>");
            Defaultability apiPackage = new Defaultability(client);
            // create domain
            TaobaoTbkDgGeneralLinkConvertTargetItemDTO taobaoTbkDgGeneralLinkConvertTargetItemDTO = new TaobaoTbkDgGeneralLinkConvertTargetItemDTO();
            taobaoTbkDgGeneralLinkConvertTargetItemDTO.setItemIdList(new ArrayList<String>());   // xxx
            TaobaoTbkDgGeneralLinkConvertLkItemDTO taobaoTbkDgGeneralLinkConvertLkItemDTO = new TaobaoTbkDgGeneralLinkConvertLkItemDTO();
            taobaoTbkDgGeneralLinkConvertLkItemDTO.setItemId("i87a9ja90d8-09qrjcoa7qwl");
            taobaoTbkDgGeneralLinkConvertLkItemDTO.setSkuId(123);
            taobaoTbkDgGeneralLinkConvertLkItemDTO.setIsTargetCoupon(1);
            taobaoTbkDgGeneralLinkConvertLkItemDTO.setCouponId("9urytzd6k4");
            taobaoTbkDgGeneralLinkConvertLkItemDTO.setExternalId("123");
            taobaoTbkDgGeneralLinkConvertLkItemDTO.setDx("1");
            TaobaoTbkDgGeneralLinkConvertLkPageDTO taobaoTbkDgGeneralLinkConvertLkPageDTO = new TaobaoTbkDgGeneralLinkConvertLkPageDTO();
            taobaoTbkDgGeneralLinkConvertLkPageDTO.setPageId("20356789765");
            taobaoTbkDgGeneralLinkConvertLkPageDTO.setTargetItemList(new ArrayList<String>());   // xxx
            TaobaoTbkDgGeneralLinkConvertLkShopDTO taobaoTbkDgGeneralLinkConvertLkShopDTO = new TaobaoTbkDgGeneralLinkConvertLkShopDTO();
            taobaoTbkDgGeneralLinkConvertLkShopDTO.setShopId("123456");
            TaobaoTbkDgGeneralLinkConvertLkMaterialDTO taobaoTbkDgGeneralLinkConvertLkMaterialDTO = new TaobaoTbkDgGeneralLinkConvertLkMaterialDTO();
            taobaoTbkDgGeneralLinkConvertLkMaterialDTO.setMaterialUrl("s.click.taobao.com");
            taobaoTbkDgGeneralLinkConvertLkMaterialDTO.setIsTargetCoupon(1);
            taobaoTbkDgGeneralLinkConvertLkMaterialDTO.setCouponId("9urytzd6k4");

            // create request
            TaobaoTbkDgGeneralLinkConvertRequest request = new TaobaoTbkDgGeneralLinkConvertRequest();
            request.setBizSceneId("1");
            request.setPromotionType("2");
        /*
            https://s.click.taobao.com/pQBDhNu,https://s.click.taobao.com/pQBDhNu
        */
            request.setMaterialList(new ArrayList<String>());
            request.setRelationId("123456");
            request.setAdzoneId(123456);
        /*
            123456
        */
            request.setSellerIdList(new ArrayList<String>());
        /*
            qYtxrMJOC8tmtM-Qq0Z65Sbbq5DqZ9
        */
            request.setItemIdList(new ArrayList<String>());
        /*
            123456
        */
            request.setPageIdList(new ArrayList<String>());
            request.setTargetItem(taobaoTbkDgGeneralLinkConvertTargetItemDTO);
        /*
            item_dto
        */
            request.setItemDto(new ArrayList<TaobaoTbkDgGeneralLinkConvertLkItemDTO>());
        /*
            page_dto
        */
            request.setPageDto(new ArrayList<TaobaoTbkDgGeneralLinkConvertLkPageDTO>());
        /*
            shop_dto
        */
            request.setShopDto(new ArrayList<TaobaoTbkDgGeneralLinkConvertLkShopDTO>());
        /*
            material_dto
        */
            request.setMaterialDto(new ArrayList<TaobaoTbkDgGeneralLinkConvertLkMaterialDTO>());
            request.setSpecialId("123");

            TaobaoTbkDgGeneralLinkConvertResponse response = apiPackage.taobaoTbkDgGeneralLinkConvert(request);
            if(!response.isSuccess()){
                System.out.println(response.getSubMsg());
            }
            System.out.println(JSON.toJSONString(response));
        }

}
