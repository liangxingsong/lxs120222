package com.bawei.lxs12022.view.fragment;

import android.view.View;
import android.widget.Button;

import com.bawei.lxs12022.R;
import com.bawei.lxs12022.base.BaseFragmnet;
import com.bawei.lxs12022.view.activity.MainActivity;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  20:01
 * 类名：com.bawei.lxs12022.view.fragment
 */

public class OtherFragment extends BaseFragmnet {
    private Button button;
    @Override
    protected void initView(View view) {
        button = view.findViewById(R.id.nutten);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.data();
            }
        });
    }

    @Override
    protected int LayoutId() {
        return R.layout.other;
    }

    @Override
    protected void initData() {

    }
}
