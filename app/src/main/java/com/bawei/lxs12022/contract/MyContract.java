package com.bawei.lxs12022.contract;

import com.bawei.lxs12022.model.bean.Bean;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  19:34
 * 类名：com.bawei.lxs12022.contract
 */

public interface MyContract {
    interface IView{
        void onMySuccess(Bean bean);
        void onMyFailing(Throwable throwable);
    }
    interface IModelCallBack{
        void onMySuccess(Bean bean);
        void onMyFailing(Throwable throwable);
    }
}
