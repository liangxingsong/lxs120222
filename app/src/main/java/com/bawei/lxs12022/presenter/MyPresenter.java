package com.bawei.lxs12022.presenter;

import com.bawei.lxs12022.contract.MyContract;
import com.bawei.lxs12022.model.MyModel;
import com.bawei.lxs12022.model.bean.Bean;
import com.bawei.lxs12022.view.fragment.MyFragment;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  19:40
 * 类名：com.bawei.lxs12022.presenter
 */

public class MyPresenter {

    private MyModel myModel;

    public void getMyData(final MyFragment iView){
        myModel = new MyModel();
        myModel.getMyData(new MyContract.IModelCallBack() {
            @Override
            public void onMySuccess(Bean bean) {
                iView.onMySuccess(bean);
            }

            @Override
            public void onMyFailing(Throwable throwable) {
                iView.onMyFailing(throwable);
            }
        });
    }
}
