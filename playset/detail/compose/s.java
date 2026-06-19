package com.bilibili.playset.detail.compose;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import com.bilibili.biligame.component.state.LoadingState;
import com.bilibili.biligame.component.view.BaseListFragment;
import fr0.C7160h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/compose/s.class */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f84430b;

    public /* synthetic */ s(Object obj, int i7) {
        this.f84429a = i7;
        this.f84430b = obj;
    }

    public final Object invoke(Object obj) {
        String str;
        switch (this.f84429a) {
            case 0:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(layoutCoordinates);
                long jMo3153getSizeYbymL2g = layoutCoordinates.mo3153getSizeYbymL2g();
                int i7 = (int) (jPositionInWindow >> 32);
                int iIntBitsToFloat = (int) Float.intBitsToFloat(i7);
                int i8 = (int) (jPositionInWindow & 4294967295L);
                ((MutableState) this.f84430b).setValue(new Rect(iIntBitsToFloat, (int) Float.intBitsToFloat(i8), (int) (Float.intBitsToFloat(i7) + ((int) (jMo3153getSizeYbymL2g >> 32))), (int) (Float.intBitsToFloat(i8) + ((int) (jMo3153getSizeYbymL2g & 4294967295L)))));
                break;
            case 1:
                View view = (View) obj;
                view.setSelected(!view.isSelected());
                C7160h c7160h = (C7160h) this.f84430b;
                boolean zIsSelected = view.isSelected();
                PlayerContainer playerContainer = c7160h.f119279a;
                if (zIsSelected) {
                    IRenderContainerService.enterWholeSceneMode$default(playerContainer.getRenderContainerService(), false, 1, (Object) null);
                    str = "1";
                } else {
                    IRenderContainerService.exitWholeSceneMode$default(playerContainer.getRenderContainerService(), false, 1, (Object) null);
                    str = "2";
                }
                C7160h.a(playerContainer, "player.player.full-more.over-view.player", "switch", str);
                break;
            default:
                LoadingState loadingState = (LoadingState) obj;
                mp.a aVar = ((BaseListFragment) this.f84430b).o;
                if (aVar != null) {
                    aVar.a(loadingState.getState());
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
