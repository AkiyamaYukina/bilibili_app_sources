package com.bilibili.playerbizcommonv2.danmaku.input.widget;

import android.view.ViewGroup;
import com.bilibili.playerbizcommonv2.danmaku.helper.SoftKeyBoardHelper;
import com.bilibili.playerbizcommonv2.danmaku.input.InputPanelContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/widget/g.class */
public final class g implements SoftKeyBoardHelper.OnSoftKeyBoardChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f81196a;

    public g(h hVar) {
        this.f81196a = hVar;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.helper.SoftKeyBoardHelper.OnSoftKeyBoardChangeListener
    public final void keyBoardHide() {
        com.bilibili.playerbizcommonv2.danmaku.input.panel.a stackTopPanel;
        com.bilibili.playerbizcommonv2.danmaku.input.panel.a stackTopPanel2;
        h hVar = this.f81196a;
        InputPanelContainer inputPanelContainer = hVar.f81205i;
        if (inputPanelContainer != null && (stackTopPanel2 = inputPanelContainer.getStackTopPanel()) != null) {
            stackTopPanel2.t();
        }
        InputPanelContainer inputPanelContainer2 = hVar.f81206j;
        if (inputPanelContainer2 != null && (stackTopPanel = inputPanelContainer2.getStackTopPanel()) != null) {
            stackTopPanel.t();
        }
        hVar.f81198a.g(false);
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.helper.SoftKeyBoardHelper.OnSoftKeyBoardChangeListener
    public final void keyBoardShow(int i7) {
        ViewGroup.LayoutParams layoutParams;
        com.bilibili.playerbizcommonv2.danmaku.input.panel.a stackTopPanel;
        com.bilibili.playerbizcommonv2.danmaku.input.panel.a stackTopPanel2;
        h hVar = this.f81196a;
        hVar.f81198a.g(true);
        if (i7 <= ((Number) hVar.f81203f.getValue()).intValue() + ((Number) hVar.f81202e.getValue()).intValue()) {
            return;
        }
        InputPanelContainer inputPanelContainer = hVar.f81205i;
        if (inputPanelContainer != null && (stackTopPanel2 = inputPanelContainer.getStackTopPanel()) != null) {
            stackTopPanel2.s();
        }
        InputPanelContainer inputPanelContainer2 = hVar.f81206j;
        if (inputPanelContainer2 != null && (stackTopPanel = inputPanelContainer2.getStackTopPanel()) != null) {
            stackTopPanel.s();
        }
        if (i7 < hVar.k()) {
            return;
        }
        InputPanelContainer inputPanelContainer3 = hVar.f81206j;
        if (inputPanelContainer3 != null) {
            inputPanelContainer3.setMaxHeight(i7);
        }
        InputPanelContainer inputPanelContainer4 = hVar.f81206j;
        if (inputPanelContainer4 == null || (layoutParams = inputPanelContainer4.getLayoutParams()) == null || layoutParams.height == i7) {
            return;
        }
        layoutParams.height = i7;
        InputPanelContainer inputPanelContainer5 = hVar.f81206j;
        if (inputPanelContainer5 != null) {
            inputPanelContainer5.setLayoutParams(layoutParams);
        }
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.helper.SoftKeyBoardHelper.OnSoftKeyBoardChangeListener
    public final void keyBoardUpdate(int i7) {
        ViewGroup.LayoutParams layoutParams;
        h hVar = this.f81196a;
        if (i7 > ((Number) hVar.f81203f.getValue()).intValue() + ((Number) hVar.f81202e.getValue()).intValue() && i7 >= hVar.k()) {
            InputPanelContainer inputPanelContainer = hVar.f81206j;
            if (inputPanelContainer != null) {
                inputPanelContainer.setMaxHeight(i7);
            }
            InputPanelContainer inputPanelContainer2 = hVar.f81206j;
            if (inputPanelContainer2 == null || (layoutParams = inputPanelContainer2.getLayoutParams()) == null || layoutParams.height == i7) {
                return;
            }
            layoutParams.height = i7;
            InputPanelContainer inputPanelContainer3 = hVar.f81206j;
            if (inputPanelContainer3 != null) {
                inputPanelContainer3.setLayoutParams(layoutParams);
            }
        }
    }
}
