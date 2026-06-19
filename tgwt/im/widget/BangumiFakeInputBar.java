package com.bilibili.tgwt.im.widget;

import DD0.AbstractC1547u;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableArrayList;
import com.bilibili.chatroomsdk.QuickMsg;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/BangumiFakeInputBar.class */
@StabilityInferred(parameters = 0)
public final class BangumiFakeInputBar extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f111336c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a f111337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C6655a f111338b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/BangumiFakeInputBar$a.class */
    public interface a {
        void a();

        void b();

        void c(@NotNull String str);

        void d();
    }

    @JvmOverloads
    public BangumiFakeInputBar(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public BangumiFakeInputBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public BangumiFakeInputBar(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        C6655a c6655a = new C6655a();
        this.f111338b = c6655a;
        AbstractC1547u abstractC1547uInflate = AbstractC1547u.inflate(LayoutInflater.from(context), this, true);
        abstractC1547uInflate.q(c6655a);
        String string = context.getString(2131835401);
        if (!Intrinsics.areEqual(string, c6655a.f111399d)) {
            c6655a.f111399d = string;
            c6655a.notifyPropertyChanged(95);
        }
        abstractC1547uInflate.f2651x.setOnClickListener(this);
        abstractC1547uInflate.f2652y.setOnClickListener(this);
        abstractC1547uInflate.f2645B.setOnClickListener(this);
    }

    @NotNull
    public final CharSequence getText() {
        return this.f111338b.f111397b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            gm.a.b(getContext(), SearchBangumiItem.TYPE_FULLNET_VARIETY, "activity://main/login/", (String) null);
            return;
        }
        a aVar = this.f111337a;
        if (aVar != null) {
            int id = view.getId();
            if (id == 2131301000) {
                aVar.a();
            } else if (id == 2131303711) {
                aVar.d();
            } else if (id == 2131304617) {
                aVar.b();
            }
        }
    }

    public final void setEmoticonBadgeVisible(boolean z6) {
        C6655a c6655a = this.f111338b;
        if (z6 == c6655a.f111400e) {
            return;
        }
        c6655a.f111400e = z6;
        c6655a.notifyPropertyChanged(182);
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        C6655a c6655a = this.f111338b;
        if (z6 != c6655a.f111398c) {
            c6655a.f111398c = z6;
            c6655a.notifyPropertyChanged(315);
        }
        super.setEnabled(z6);
    }

    public final void setOnInputBarClickListener(@Nullable a aVar) {
        this.f111337a = aVar;
    }

    public final void setQuickMsgData(@NotNull List<QuickMsg> list) {
        C6655a c6655a = this.f111338b;
        boolean z6 = !list.isEmpty();
        if (z6 != c6655a.f111401f) {
            c6655a.f111401f = z6;
            c6655a.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_FACE_OCCLUSION_SEGMENT_USE_TEMPERATURE);
        }
        this.f111338b.f111396a.clear();
        ObservableArrayList<C6656b> observableArrayList = this.f111338b.f111396a;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            observableArrayList.add(new C6656b((QuickMsg) it.next(), new C6657c(this)));
        }
    }

    public final void setText(@NotNull CharSequence charSequence) {
        C6655a c6655a = this.f111338b;
        if (Intrinsics.areEqual(charSequence, c6655a.f111397b)) {
            return;
        }
        c6655a.f111397b = charSequence;
        c6655a.notifyPropertyChanged(318);
    }

    public final void setVoiceBtnVisible(boolean z6) {
        C6655a c6655a = this.f111338b;
        if (z6 == c6655a.f111402g) {
            return;
        }
        c6655a.f111402g = z6;
        c6655a.notifyPropertyChanged(729);
    }
}
