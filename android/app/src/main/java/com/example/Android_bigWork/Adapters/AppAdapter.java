package com.example.Android_bigWork.Adapters;

import android.content.Context;
import android.view.View;

import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


/**
 *    desc   : RecyclerView 适配器业务基类
 */
public abstract class AppAdapter<T> extends BaseAdapter<BaseAdapter<?>.ViewHolder> {

    /** 列表数据 */
    private List<T> mDataSet;

    /** 标记对象 */
    private Object mTag;

    public AppAdapter(@NonNull Context context) {
        super(context);
    }

    @Override
    public int getItemCount() {
        return getCount();
    }

    /**
     * 获取数据总数
     */
    public int getCount() {
        if (mDataSet == null) {
            return 0;
        }
        return mDataSet.size();
    }

    /**
     * 设置新的数据
     */
    public void setData(@Nullable List<T> data) {
        mDataSet = data;
        notifyDataSetChanged();
    }

    /**
     * 获取某个位置上的数据
     */
    public T getItem(@IntRange(from = 0) int position) {
        if (mDataSet == null) {
            return null;
        }
        return mDataSet.get(position);
    }

    /**
     * 获取标记
     */
    @Nullable
    public Object getTag() {
        return mTag;
    }

    /**
     * 设置标记
     */
    public void setTag(@NonNull Object tag) {
        mTag = tag;
    }

    public final class SimpleHolder extends ViewHolder {

        public SimpleHolder(@LayoutRes int id) {
            super(id);
        }

        @Override
        public void onBindView(int position) {}
    }
}