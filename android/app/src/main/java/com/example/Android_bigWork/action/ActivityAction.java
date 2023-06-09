package com.example.Android_bigWork.action;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;

/**
 *    desc   : Activity 相关意图
 */
public interface ActivityAction {

    /**
     * 获取 Context 对象
     */
    Context getContext();

    /**
     * 获取 Activity 对象
     */
    default Activity getActivity() {
        Context context = getContext();
        do {
            if (context instanceof Activity) {      //当前 context 为 Activity类
                return (Activity) context;
            } else if (context instanceof ContextWrapper) { // context 是一个包装了另一个 Context 对象的对象
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return null;
            }
        } while (context != null);
        return null;
    }

}