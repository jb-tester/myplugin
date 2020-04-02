package com.myplugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class Action1 extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        MyDialog.main(null);
    }
}
