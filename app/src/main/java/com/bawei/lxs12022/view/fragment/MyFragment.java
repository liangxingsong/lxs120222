package com.bawei.lxs12022.view.fragment;

import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import com.bawei.lxs12022.R;
import com.bawei.lxs12022.base.BaseFragmnet;
import com.bawei.lxs12022.contract.MyContract;
import com.bawei.lxs12022.model.bean.Bean;
import com.bawei.lxs12022.presenter.MyPresenter;
import com.bawei.lxs12022.view.adapter.MyAdapter;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  20:27
 * 类名：com.bawei.lxs12022.view.fragment
 */

public class MyFragment extends BaseFragmnet implements MyContract.IView {
    private GridView gridView;
    private MyPresenter myPresenter;
    @Override
    protected void initView(View view) {
        gridView = view.findViewById(R.id.gv);

    }

    @Override
    protected int LayoutId() {
        return R.layout.my;
    }

    @Override
    protected void initData() {
        myPresenter = new MyPresenter();
        myPresenter.getMyData(this);
    }

    @Override
    public void onMySuccess(Bean bean) {
        Toast.makeText(getActivity(), "成功！！！", Toast.LENGTH_SHORT).show();
        MyAdapter myAdapter = new MyAdapter(getActivity(),bean.getData());
        gridView.setAdapter(myAdapter);
    }

    @Override
    public void onMyFailing(Throwable throwable) {
        Toast.makeText(getActivity(), "失败！！！", Toast.LENGTH_SHORT).show();
    }
}
