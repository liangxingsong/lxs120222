package com.bawei.lxs12022.view.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.lxs12022.R;
import com.bawei.lxs12022.base.BaseFragmnet;
import com.bawei.lxs12022.util.NetUtil;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  19:54
 * 类名：com.bawei.lxs12022.view.fragment
 */

public class HomeFragment extends BaseFragmnet {
    private TextView textView;
    private ImageView imageView;
    @Override
    protected void initView(View view) {
        textView = view.findViewById(R.id.ttvv);
        imageView = view.findViewById(R.id.iivv);
    }

    @Override
    protected int LayoutId() {
        return R.layout.home;
    }

    @Override
    protected void initData() {
        if (NetUtil.getInstance().hasNet(getActivity())){
            textView.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);
        }else{
            textView.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
        }
    }
}
