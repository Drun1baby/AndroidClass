package com.example.Android_bigWork.Utils;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;

import java.util.InputMismatchException;

public class KeyboardUtils {
    /**
     * 隐藏软键盘
     */
    public static void hideKeyboard(Activity context) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.hideSoftInputFromWindow(context.getWindow().getDecorView().getWindowToken(), 0);
        }

    }
}
