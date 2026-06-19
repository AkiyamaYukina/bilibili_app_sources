package com.bilibili.tgwt.im.widget;

import DD0.V;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.chatroomsdk.ChatBubble;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.service.ChatService;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.tgwt.im.widget.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/e.class */
@StabilityInferred(parameters = 0)
public final class C6659e extends Wj0.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ScreenStateService f111408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final ChatBubble f111409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final CharSequence f111410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ChatService f111411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C6661g f111413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC6660f f111414q;

    /* JADX WARN: Multi-variable type inference failed */
    public C6659e(@NotNull Context context, @NotNull ScreenStateService screenStateService, @Nullable ChatBubble chatBubble, @NotNull CharSequence charSequence, @NotNull ChatService chatService, @NotNull ChatRoomManagerService chatRoomManagerService) {
        super(context);
        this.f111408k = screenStateService;
        this.f111409l = chatBubble;
        this.f111410m = charSequence;
        this.f111411n = chatService;
        this.f111412o = chatRoomManagerService;
        setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.bilibili.tgwt.im.widget.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C6659e f111407a;

            {
                this.f111407a = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C6659e c6659e = this.f111407a;
                if (c6659e.f111408k.getScreenStateHelper().a().b) {
                    return;
                }
                c6659e.f111412o.f110930w.setValue(0);
            }
        });
    }

    @Override // Wj0.a
    public final void dismiss() {
        superDismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final View onCreateView() {
        int iJ;
        V vInflate = V.inflate(LayoutInflater.from(getContext()), null, false);
        int iA = Kl.d.a(ContextUtilKt.requireActivity(getContext()).getWindow());
        boolean z6 = this.f111408k.getScreenStateHelper().a().a;
        ChatBubble chatBubble = this.f111409l;
        if (z6) {
            iJ = Nl0.f.j(getContext());
        } else {
            iJ = Uj0.c.b(280, getContext()) + iA;
        }
        C6661g c6661g = new C6661g(!z6, chatBubble, iJ);
        this.f111413p = c6661g;
        InterfaceC6660f interfaceC6660f = this.f111414q;
        InterfaceC6660f interfaceC6660f2 = interfaceC6660f;
        if (interfaceC6660f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("action");
            interfaceC6660f2 = null;
        }
        c6661g.f111418d = interfaceC6660f2;
        C6661g c6661g2 = this.f111413p;
        C6661g c6661g3 = c6661g2;
        if (c6661g2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            c6661g3 = null;
        }
        vInflate.q(c6661g3);
        View view = vInflate.f2380L;
        C6661g c6661g4 = this.f111413p;
        if (c6661g4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            c6661g4 = null;
        }
        view.setOnTouchListener(new BangumiVoiceSendBtnTouchListener(c6661g4, this.f111411n));
        return vInflate.getRoot();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Wj0.a, Wj0.d
    public final void onStart() {
        super.onStart();
        if (!this.f111408k.getScreenStateHelper().a().b) {
            this.f111412o.f110930w.setValue(Integer.valueOf(Uj0.c.b(200, getContext())));
        }
        Window window = getWindow();
        if (window != null) {
            window.setFlags(1024, 1024);
            window.setBackgroundDrawableResource(R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = 1.0f;
            attributes.dimAmount = 0.0f;
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
        }
    }

    public final void setUiBeforeShow() {
        C6661g c6661g = this.f111413p;
        C6661g c6661g2 = c6661g;
        if (c6661g == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            c6661g2 = null;
        }
        if (true != c6661g2.f111419e) {
            c6661g2.f111419e = true;
            c6661g2.notifyPropertyChanged(729);
        }
        C6661g c6661g3 = this.f111413p;
        if (c6661g3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            c6661g3 = null;
        }
        CharSequence charSequence = this.f111410m;
        if (Intrinsics.areEqual(charSequence, c6661g3.f111423j)) {
            return;
        }
        c6661g3.f111423j = charSequence;
        c6661g3.notifyPropertyChanged(318);
    }
}
