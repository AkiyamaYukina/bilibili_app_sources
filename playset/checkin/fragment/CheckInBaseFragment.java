package com.bilibili.playset.checkin.fragment;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import com.bilibili.lib.ui.BaseRecyclerViewToolbarFragment;
import com.bilibili.magicasakura.widgets.TintToolbar;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/fragment/CheckInBaseFragment.class */
@StabilityInferred(parameters = 0)
public class CheckInBaseFragment extends BaseRecyclerViewToolbarFragment {
    public final void mf(@StringRes int i7) {
        setTitle(i7);
        TintToolbar mToolbar = getMToolbar();
        if (mToolbar != null) {
            mToolbar.setNavigationIcon(2131234013);
            CharSequence title = mToolbar.getTitle();
            Iterator it = ViewGroupKt.getChildren(mToolbar).iterator();
            int i8 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i8 = -1;
                    break;
                }
                Object next = it.next();
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                View view = (View) next;
                if ((view instanceof TextView) && Intrinsics.areEqual(((TextView) view).getText(), title)) {
                    break;
                } else {
                    i8++;
                }
            }
            View childAt = mToolbar.getChildAt(i8);
            TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                textView.setGravity(17);
                Toolbar.g gVar = new Toolbar.g(-1);
                gVar.f31512a = 17;
                textView.setLayoutParams(gVar);
                textView.setText(title);
            }
        }
    }
}
