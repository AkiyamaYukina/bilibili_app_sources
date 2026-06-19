package com.bilibili.upper.module.cover_v2.widgets;

import KH0.e;
import KS.k;
import WQ.H;
import WQ.H0;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.l;
import com.bilibili.ad.exposecheck.m;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bililive.room.ui.widget.LiveSingleFollowView;
import com.bilibili.bplus.following.event.ui.home.EventTopicHomeFragment;
import com.bilibili.bplus.followinglist.module.item.attach.p;
import com.bilibili.bplus.followinglist.service.N;
import com.bilibili.bplus.followinglist.service.c0;
import com.bilibili.upper.module.cover_v2.widgets.MultiCaptionTextInputView;
import eb.i;
import eb.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/MultiCaptionTextInputView.class */
@StabilityInferred(parameters = 0)
public final class MultiCaptionTextInputView extends FrameLayout implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f113021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final EditText f113022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final View f113023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextView f113024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public a f113025g;
    public boolean h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/MultiCaptionTextInputView$a.class */
    public interface a {
        void a(@Nullable String str, boolean z6);
    }

    public MultiCaptionTextInputView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f113019a = 60;
        View viewInflate = LayoutInflater.from(context).inflate(2131501565, (ViewGroup) this, true);
        this.f113021c = viewInflate;
        EditText editText = (EditText) viewInflate.findViewById(2131301194);
        this.f113022d = editText;
        View viewFindViewById = viewInflate.findViewById(2131304132);
        this.f113023e = viewFindViewById;
        this.f113024f = (TextView) viewInflate.findViewById(2131315566);
        editText.addTextChangedListener(this);
        editText.setHint((String) e.f12735c.getValue());
        editText.setText("");
        final int i7 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this, i7) { // from class: TH0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24162a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f24163b;

            {
                this.f24162a = i7;
                this.f24163b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0 c0VarE;
                switch (this.f24162a) {
                    case 0:
                        ((MultiCaptionTextInputView) this.f24163b).f113022d.setText("");
                        break;
                    case 1:
                        ((EventTopicHomeFragment) this.f24163b).onRefresh();
                        break;
                    default:
                        p pVar = (p) this.f24163b;
                        int i8 = p.m;
                        if (((k) pVar).b != null) {
                            H0 h02 = ((k) pVar).c;
                            N n7 = ((k) pVar).d;
                            if (n7 != null && (c0VarE = n7.e()) != null) {
                                c0.c(c0VarE, h02 != null ? h02.r : null, (H) null, 6);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.f113020b = editText.getCurrentHintTextColor();
        getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: TH0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiCaptionTextInputView f24164a;

            {
                this.f24164a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                MultiCaptionTextInputView.a aVar = this.f24164a.f113025g;
            }
        });
    }

    private final void setCaptionText(String str) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        String string;
        a aVar;
        if (editable == null || (string = editable.toString()) == null) {
            return;
        }
        this.f113023e.setVisibility(string.length() != 0 ? 0 : 8);
        c(string);
        if (this.h || (aVar = this.f113025g) == null) {
            return;
        }
        String string2 = editable.toString();
        String strA = string2;
        if (string2.length() == 0) {
            strA = Zw0.a.a();
        }
        aVar.a(strA, Intrinsics.areEqual(strA, Zw0.a.a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(@org.jetbrains.annotations.Nullable com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo r9, int r10) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover_v2.widgets.MultiCaptionTextInputView.b(com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo, int):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i7, int i8, int i9) {
    }

    public final void c(String str) {
        int length = str != null ? str.length() : 0;
        TextView textView = this.f113024f;
        textView.setVisibility(length != 0 ? 0 : 8);
        textView.setText(length + "/" + this.f113019a);
        textView.setTextColor(length == this.f113019a ? 0 : this.f113020b);
    }

    @NotNull
    public final EditText getEditText() {
        return this.f113022d;
    }

    @Nullable
    public final a getInputListener() {
        return this.f113025g;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i7, int i8, int i9) {
    }

    public final void setEtCaptionTextViewText(@Nullable CharSequence charSequence) {
        if (Intrinsics.areEqual(charSequence, Zw0.a.a())) {
            charSequence = "";
        }
        this.h = true;
        EditText editText = this.f113022d;
        String string = "";
        if (charSequence != null) {
            string = charSequence.toString();
            if (string == null) {
                string = "";
            }
        }
        editText.setText(string);
        c(string);
        final int i7 = 0;
        this.f113022d.postDelayed(new Runnable(this, i7) { // from class: TH0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24160a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f24161b;

            {
                this.f24160a = i7;
                this.f24161b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f24160a) {
                    case 0:
                        ((MultiCaptionTextInputView) this.f24161b).h = false;
                        break;
                    case 1:
                        i iVar = (i) this.f24161b;
                        Lifecycle lifecycle = ListExtentionsKt.lifecycle(iVar.b().getContext());
                        RecyclerView recyclerView = iVar.e;
                        RecyclerView recyclerView2 = recyclerView;
                        if (recyclerView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                            recyclerView2 = null;
                        }
                        new m(lifecycle, recyclerView2, new j(iVar, 0), new l(iVar, 5), 16);
                        break;
                    default:
                        LiveSingleFollowView liveSingleFollowView = (LiveSingleFollowView) this.f24161b;
                        int i8 = LiveSingleFollowView.p;
                        liveSingleFollowView.a();
                        break;
                }
            }
        }, 100L);
    }

    public final void setInputListener(@Nullable a aVar) {
        this.f113025g = aVar;
    }
}
