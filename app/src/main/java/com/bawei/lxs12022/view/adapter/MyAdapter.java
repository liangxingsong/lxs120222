package com.bawei.lxs12022.view.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.lxs12022.R;
import com.bawei.lxs12022.model.bean.Bean;
import com.bawei.lxs12022.util.NetUtil;

import java.util.List;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  19:45
 * 类名：com.bawei.lxs12022.view.adapter
 */

public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<Bean.DataBean> data;

    public MyAdapter(Context context, List<Bean.DataBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            view = View.inflate(context, R.layout.layout,null);
            holder.imageView = view.findViewById(R.id.iv);
            holder.textView = view.findViewById(R.id.tv);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        holder.textView.setText(data.get(i).getGoods_name());
        String goods_thumb = data.get(i).getGoods_thumb();
        NetUtil.getInstance().dogetphoto(goods_thumb,holder.imageView);
        return view;
    }

    private class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
