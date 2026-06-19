package com.bilibili.tgwt.im.widget;

import DD0.M;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ImageViewCompat;
import com.bilibili.app.comm.emoticon.model.Emote;
import com.bilibili.app.comm.emoticon.ui.ImageEmoticonPanel;
import com.bilibili.app.comm.emoticon.ui.y;
import com.bilibili.chatroom.vo.ChatEmote;
import com.bilibili.chatroom.widget.ChatInputEditText;
import com.bilibili.chatroom.widget.i;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.im.ui.PlayerChatMsgFragment;
import com.bilibili.tgwt.service.ChatService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import j5.C7642d;
import java.util.ArrayList;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/D.class */
@StabilityInferred(parameters = 0)
public final class D extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final a f111349A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ChatService f111351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC6660f f111352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Handler f111353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final View f111354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ViewGroup f111355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ChatInputEditText f111356g;

    @NotNull
    public final View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TextView f111357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ImageView f111358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final FrameLayout f111359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final View f111360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ConstraintLayout f111361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f111362n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f111363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public com.bilibili.app.comm.emoticon.ui.m f111364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f111365q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f111366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.bilibili.chatroom.widget.i f111367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public PlayerChatMsgFragment f111368t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Rect f111369u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final y f111370v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final z f111371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final b f111372x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Ob1.D f111373y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final BX.b f111374z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/D$a.class */
    public static final class a implements y.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D f111375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f111376b;

        public a(D d7, Context context) {
            this.f111375a = d7;
            this.f111376b = context;
        }

        public final void a() {
            Editable text;
            D d7 = this.f111375a;
            int selectionStart = d7.f111356g.getSelectionStart();
            if (selectionStart > 0 && (text = d7.f111356g.getText()) != null) {
                text.delete(selectionStart - 1, selectionStart);
            }
        }

        public final void b(Emote emote) {
            VipUserInfo vipInfo;
            int i7 = emote.type;
            D d7 = this.f111375a;
            if (i7 != 2) {
                D.b(d7, emote);
                return;
            }
            BiliAccountInfo biliAccountInfo = com.bilibili.ogv.infra.account.a.f67851a;
            if (biliAccountInfo.isEffectiveVip()) {
                D.b(d7, emote);
                return;
            }
            AccountInfo accountInfoFromCache = biliAccountInfo.getAccountInfoFromCache();
            if (accountInfoFromCache == null || (vipInfo = accountInfoFromCache.getVipInfo()) == null || !vipInfo.isFrozen()) {
                return;
            }
            ToastHelper.showToastLong(this.f111376b, this.f111376b.getString(2131836317));
        }

        public final void c(Emote emote) {
            D.b(this.f111375a, emote);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/D$b.class */
    public static final class b implements i.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D f111377a;

        public b(D d7) {
            this.f111377a = d7;
        }

        public final void keyBoardHide() {
            D d7 = this.f111377a;
            if (d7.f111366r) {
                d7.f111366r = false;
            } else {
                d7.dismiss();
            }
            d7.h.setVisibility(8);
        }

        public final void keyBoardShow(int i7) {
            D d7 = this.f111377a;
            d7.f111365q = i7;
            d7.f111350a.f110931x.setValue(Integer.valueOf(i7));
            d7.h.setVisibility(0);
            d7.h.getLayoutParams().height = i7;
            d7.c();
            if (d7.f111366r) {
                d7.f111366r = false;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/D$c.class */
    public static final class c implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D f111378a;

        public c(D d7) {
            this.f111378a = d7;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.f111378a.f111356g.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f111378a.f111356g.requestFocus();
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [com.bilibili.tgwt.im.widget.y] */
    /* JADX WARN: Type inference failed for: r1v30, types: [com.bilibili.tgwt.im.widget.z] */
    public D(@NotNull Context context, @NotNull ChatRoomManagerService chatRoomManagerService, @NotNull ChatService chatService, @NotNull InterfaceC6660f interfaceC6660f) {
        super(context, 2131886241);
        this.f111350a = chatRoomManagerService;
        this.f111351b = chatService;
        this.f111352c = interfaceC6660f;
        this.f111353d = new Handler(Looper.getMainLooper());
        View viewInflate = LayoutInflater.from(context).inflate(2131500190, (ViewGroup) null, false);
        this.f111354e = viewInflate;
        this.f111355f = (ViewGroup) viewInflate.findViewById(2131298701);
        this.f111356g = viewInflate.findViewById(2131303711);
        this.h = viewInflate.findViewById(2131316308);
        this.f111357i = (TextView) viewInflate.findViewById(2131311103);
        this.f111358j = (ImageView) viewInflate.findViewById(2131301000);
        this.f111359k = (FrameLayout) viewInflate.findViewById(2131301006);
        this.f111360l = viewInflate.findViewById(2131304408);
        this.f111369u = new Rect();
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener(this) { // from class: com.bilibili.tgwt.im.widget.x

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final D f111473a;

            {
                this.f111473a = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Context context2;
                M m7;
                D d7 = this.f111473a;
                d7.f111353d.removeCallbacks(d7.f111373y);
                InputMethodManagerHelper.hideSoftInput(d7.f111356g.getContext(), d7.f111356g, 0);
                d7.c();
                d7.h.setVisibility(8);
                View view = d7.f111362n;
                View view2 = view;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFakeEmotion");
                    view2 = null;
                }
                view2.setVisibility(0);
                ConstraintLayout constraintLayout = d7.f111361m;
                ConstraintLayout constraintLayout2 = constraintLayout;
                if (constraintLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
                    constraintLayout2 = null;
                }
                constraintLayout2.setVisibility(0);
                ConstraintLayout constraintLayout3 = d7.f111361m;
                ConstraintLayout constraintLayout4 = constraintLayout3;
                if (constraintLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
                    constraintLayout4 = null;
                }
                constraintLayout4.removeOnLayoutChangeListener(d7.f111370v);
                d7.f111355f.removeOnLayoutChangeListener(d7.f111370v);
                d7.f111356g.clearFocus();
                com.bilibili.chatroom.widget.i iVar = d7.f111367s;
                com.bilibili.chatroom.widget.i iVar2 = iVar;
                if (iVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSoftKeyBoardListener");
                    iVar2 = null;
                }
                View view3 = iVar2.h;
                if (view3 != null) {
                    view3.getViewTreeObserver().removeOnGlobalLayoutListener(iVar2.i);
                    iVar2.h = null;
                }
                d7.f111350a.f110931x.setValue(0);
                d7.f111353d.removeCallbacks(d7.f111374z);
                d7.f111353d.removeCallbacks(d7.f111373y);
                String strValueOf = String.valueOf(d7.f111356g.getText());
                PlayerChatMsgFragment playerChatMsgFragment = d7.f111368t;
                if (playerChatMsgFragment == null || (context2 = playerChatMsgFragment.getContext()) == null || (m7 = playerChatMsgFragment.f111261b) == null) {
                    return;
                }
                m7.f2314A.setText(strValueOf);
                if (strValueOf.length() == 0) {
                    M m8 = playerChatMsgFragment.f111261b;
                    if (m8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        m8 = null;
                    }
                    m8.f2314A.setHint(context2.getString(2131836300));
                }
            }
        };
        this.f111370v = new View.OnLayoutChangeListener(this) { // from class: com.bilibili.tgwt.im.widget.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final D f111474a;

            {
                this.f111474a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                D d7 = this.f111474a;
                Window window = d7.getWindow();
                if (window != null) {
                    int[] iArr = new int[2];
                    ConstraintLayout constraintLayout = d7.f111361m;
                    ConstraintLayout constraintLayout2 = constraintLayout;
                    if (constraintLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
                        constraintLayout2 = null;
                    }
                    constraintLayout2.getLocationOnScreen(iArr);
                    int i15 = iArr[0];
                    ConstraintLayout constraintLayout3 = d7.f111361m;
                    ConstraintLayout constraintLayout4 = constraintLayout3;
                    if (constraintLayout3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
                        constraintLayout4 = null;
                    }
                    int measuredWidth = constraintLayout4.getMeasuredWidth();
                    d7.f111355f.getLocationOnScreen(iArr);
                    int measuredWidth2 = (measuredWidth + i15) - (d7.f111355f.getMeasuredWidth() + iArr[0]);
                    int i16 = d7.f111355f.getLayoutParams().width;
                    ConstraintLayout constraintLayout5 = d7.f111361m;
                    if (constraintLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
                        constraintLayout5 = null;
                    }
                    if (i16 != constraintLayout5.getMeasuredWidth() - measuredWidth2) {
                        d7.f111355f.post(new Runnable(d7, measuredWidth2, window) { // from class: com.bilibili.tgwt.im.widget.A

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final D f111332a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final int f111333b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final Window f111334c;

                            {
                                this.f111332a = d7;
                                this.f111333b = measuredWidth2;
                                this.f111334c = window;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                D d8 = this.f111332a;
                                int i17 = this.f111333b;
                                Window window2 = this.f111334c;
                                ViewGroup.LayoutParams layoutParams = d8.f111355f.getLayoutParams();
                                ConstraintLayout constraintLayout6 = d8.f111361m;
                                ConstraintLayout constraintLayout7 = constraintLayout6;
                                if (constraintLayout6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
                                    constraintLayout7 = null;
                                }
                                layoutParams.width = constraintLayout7.getMeasuredWidth() - i17;
                                ViewGroup viewGroup = d8.f111355f;
                                viewGroup.setPadding(viewGroup.getPaddingStart(), 0, Math.max(0, Kl.d.a(window2) - i17), 0);
                                d8.f111355f.requestLayout();
                            }
                        });
                    }
                }
            }
        };
        AX.d.a(this, onDismissListener);
        this.f111371w = new View.OnFocusChangeListener(this) { // from class: com.bilibili.tgwt.im.widget.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final D f111475a;

            {
                this.f111475a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                D d7 = this.f111475a;
                d7.f111356g.setSelection(d7.f111356g.getText().length());
                if (z6) {
                    d7.f();
                }
            }
        };
        this.f111372x = new b(this);
        this.f111373y = new Ob1.D(this, 2);
        this.f111374z = new BX.b(3, this, context);
        this.f111349A = new a(this, context);
    }

    public static final int a(D d7, int i7) {
        int spanStart;
        Editable text = d7.f111356g.getText();
        int i8 = 0;
        lV.z[] zVarArr = text == null ? null : (lV.z[]) text.getSpans(0, text.length(), lV.z.class);
        if (zVarArr != null) {
            int length = zVarArr.length;
            while (true) {
                spanStart = i7;
                if (i8 >= length) {
                    break;
                }
                lV.z zVar = zVarArr[i8];
                spanStart = d7.f111356g.getEditableText().getSpanStart(zVar);
                int spanEnd = d7.f111356g.getEditableText().getSpanEnd(zVar);
                if (spanStart + 1 > i7 || i7 >= spanEnd) {
                    i8++;
                } else if (i7 - spanStart > (spanEnd - spanStart) / 2) {
                    spanStart = spanEnd;
                }
            }
        } else {
            spanStart = -1;
        }
        return spanStart;
    }

    public static final void b(D d7, Emote emote) {
        d7.getClass();
        String str = emote.name;
        E e7 = new E(d7);
        ((lV.z) e7).a = str;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(e7, 0, str.length(), 33);
        int selectionStart = d7.f111356g.getSelectionStart();
        if (selectionStart >= 0) {
            d7.f111356g.getText().insert(selectionStart, spannableString);
        } else {
            d7.f111356g.getText().append((CharSequence) spannableString);
        }
        PlayerChatMsgFragment playerChatMsgFragment = d7.f111368t;
        if (playerChatMsgFragment != null) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = playerChatMsgFragment.f111262c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            togetherWatchDetailPageViewModel2.getChatService().f111907z.put(emote.name, ChatEmote.a.a(emote));
        }
    }

    public final void c() {
        this.f111358j.setImageDrawable(AppCompatResources.getDrawable(getContext(), 2131233643));
        ImageViewCompat.setImageTintList(this.f111358j, AppCompatResources.getColorStateList(getContext(), R$color.Ga5));
        this.f111359k.setVisibility(8);
    }

    public final void d(boolean z6) {
        show();
        int[] iArr = new int[2];
        ConstraintLayout constraintLayout = this.f111361m;
        ConstraintLayout constraintLayout2 = constraintLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
            constraintLayout2 = null;
        }
        constraintLayout2.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        ConstraintLayout constraintLayout3 = this.f111361m;
        ConstraintLayout constraintLayout4 = constraintLayout3;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
            constraintLayout4 = null;
        }
        int measuredWidth = constraintLayout4.getMeasuredWidth();
        this.f111355f.getWindowVisibleDisplayFrame(this.f111369u);
        int i8 = this.f111369u.right;
        ViewGroup.LayoutParams layoutParams = this.f111355f.getLayoutParams();
        ConstraintLayout constraintLayout5 = this.f111361m;
        ConstraintLayout constraintLayout6 = constraintLayout5;
        if (constraintLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
            constraintLayout6 = null;
        }
        layoutParams.width = constraintLayout6.getMeasuredWidth() - ((measuredWidth + i7) - i8);
        this.f111355f.requestLayout();
        ConstraintLayout constraintLayout7 = this.f111361m;
        ConstraintLayout constraintLayout8 = constraintLayout7;
        if (constraintLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
            constraintLayout8 = null;
        }
        constraintLayout8.addOnLayoutChangeListener(this.f111370v);
        this.f111355f.addOnLayoutChangeListener(this.f111370v);
        ConstraintLayout constraintLayout9 = this.f111361m;
        ConstraintLayout constraintLayout10 = constraintLayout9;
        if (constraintLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
            constraintLayout10 = null;
        }
        constraintLayout10.setVisibility(4);
        View view = this.f111362n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFakeEmotion");
            view = null;
        }
        view.setVisibility(8);
        this.f111363o = z6;
    }

    public final void e() {
        if (com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            this.f111353d.postDelayed(this.f111374z, 150L);
        } else {
            gm.a.b(getContext(), SearchBangumiItem.TYPE_FULLNET_VARIETY, "activity://main/login/", (String) null);
        }
    }

    public final void f() {
        if (!this.f111356g.isFocused()) {
            this.f111356g.requestFocus();
        }
        this.f111353d.postDelayed(this.f111373y, 150L);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        int id = view.getId();
        if (id == 2131298720) {
            dismiss();
            return;
        }
        if (id == 2131311103) {
            this.f111351b.l(String.valueOf(this.f111356g.getText()), null, true);
            return;
        }
        if (id != 2131301000) {
            if (id == 2131304408) {
                dismiss();
                this.f111351b.r(String.valueOf(this.f111356g.getText()), this.f111352c);
                return;
            }
            return;
        }
        this.f111366r = true;
        if (this.f111364p != null && this.f111359k.isShown()) {
            f();
        } else {
            Neurons.reportClick$default(false, "pgc.watch-together-cinema.cinema-im.emoji.click", (Map) null, 4, (Object) null);
            e();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f111358j.setOnClickListener(this);
        this.f111354e.setOnClickListener(this);
        this.f111355f.setOnClickListener(this);
        this.f111360l.setOnClickListener(this);
        View view = this.f111360l;
        ConstraintLayout constraintLayout = this.f111361m;
        ConstraintLayout constraintLayout2 = constraintLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
            constraintLayout2 = null;
        }
        view.setVisibility(constraintLayout2.findViewById(2131304408).getVisibility());
        this.f111355f.setOnFocusChangeListener(this.f111371w);
        setContentView(this.f111354e);
        TextView textView = this.f111357i;
        Editable text = this.f111356g.getText();
        textView.setEnabled(!(text == null || text.length() == 0));
        if (this.f111357i.isEnabled()) {
            this.f111357i.setTypeface(null, 1);
        } else {
            this.f111357i.setTypeface(null, 0);
        }
        this.f111357i.setOnClickListener(this);
        this.f111356g.setImeOptions(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE);
        this.f111356g.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: com.bilibili.tgwt.im.widget.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final D f111472a;

            {
                this.f111472a = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i7, KeyEvent keyEvent) {
                boolean z6;
                D d7 = this.f111472a;
                if (i7 == 2 || i7 == 4 || i7 == 5 || i7 == 6) {
                    d7.f111351b.l(String.valueOf(d7.f111356g.getText()), null, true);
                    z6 = true;
                } else {
                    z6 = false;
                }
                return z6;
            }
        });
        this.f111356g.addTextChangedListener(new B(this));
        this.f111356g.setOnSelectionChange(new C(this));
        com.bilibili.app.comm.emoticon.ui.m mVar = this.f111364p;
        if (mVar != null) {
            mVar.d();
        }
        if (this.f111356g.isInEditMode()) {
            return;
        }
        Context context = getContext();
        a aVar = this.f111349A;
        FrameLayout frameLayout = this.f111359k;
        ImageEmoticonPanel mVar2 = null;
        if (context != null) {
            if (TextUtils.isEmpty("watch_full")) {
                mVar2 = null;
            } else {
                mVar2 = new com.bilibili.app.comm.emoticon.ui.m("watch_full");
                mVar2.u = new ArrayList();
                ((com.bilibili.app.comm.emoticon.ui.m) mVar2).h = true;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar2).i = true;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar2).j = null;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar2).e = context;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar2).c = aVar;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar2).d = null;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar2).f = null;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar2).b = frameLayout;
                frameLayout.addView(mVar2.c(mVar2.b()));
                mVar2.e(mVar2.a());
                ((com.bilibili.app.comm.emoticon.ui.m) mVar2).g = "watch-together";
            }
        }
        this.f111364p = mVar2;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.clearFlags(131080);
        window.setFlags(1024, 1024);
        window.setSoftInputMode(48);
        if (NotchCompat.hasDisplayCutoutHardware(window)) {
            NotchCompat.immersiveDisplayCutout(window);
            window.getDecorView().setSystemUiVisibility(1280);
        }
        window.setDimAmount(0.0f);
        WindowManager.LayoutParams attributes = window.getAttributes();
        C7642d.a(window, 0);
        attributes.height = -1;
        attributes.width = -1;
        window.setAttributes(attributes);
        this.f111354e.postDelayed(new Kr.b(this, 1), 150L);
        com.bilibili.chatroom.widget.i iVar = new com.bilibili.chatroom.widget.i(this.f111372x, getContext());
        this.f111367s = iVar;
        iVar.a(ContextUtilKt.requireActivity(getContext()).getWindow());
    }
}
