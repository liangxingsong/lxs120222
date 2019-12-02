package com.bawei.lxs12022.model;

import com.bawei.lxs12022.contract.MyContract;
import com.bawei.lxs12022.model.bean.Bean;
import com.bawei.lxs12022.util.NetUtil;
import com.google.gson.Gson;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  19:35
 * 类名：com.bawei.lxs12022.model
 */

public class MyModel {
    public void getMyData(final MyContract.IModelCallBack iModelCallBack){
        NetUtil.getInstance().doget("http://blog.zhaoliang5156.cn/api/shop/shop1.json", new NetUtil.MyCallBack() {
            @Override
            public void doget(String json) {
                Bean bean = new Gson().fromJson(json, Bean.class);
                iModelCallBack.onMySuccess(bean);
            }

            @Override
            public void Error(Throwable throwable) {
                iModelCallBack.onMyFailing(throwable);
            }
        });
    }
}
