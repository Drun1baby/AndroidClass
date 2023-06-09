package com.example.Android_bigWork.action;

import android.view.View;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;

/**
 *    desc   : 点击事件意图
 */
public interface ClickAction extends View.OnClickListener {

    <V extends View> V findViewById(@IdRes int id);     //根据id查找View

    default void setOnClickListener(View... views) {
       setOnClickListener(this, views);
    }

    default void setOnClickListener(@Nullable View.OnClickListener listener, View... views) {
        for (View view : views) {
            view.setOnClickListener(listener);
        }
    }

    @Override
    default void onClick(View view) {
        // 默认不实现 子类实现
    }
}