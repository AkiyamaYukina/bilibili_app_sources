package com.bilibili.playerbizcommon.widget.function.feedback;

import Cg.l;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.bilibili.app.comm.servercomm.ServerClock;
import com.bilibili.base.BiliContext;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintButton;
import com.bilibili.magicasakura.widgets.TintEditText;
import com.bilibili.magicasakura.widgets.TintRadioButton;
import com.bilibili.playerbizcommon.widget.function.feedback.d;
import java.math.BigDecimal;
import java.util.ArrayList;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/PlayerFeedbackFragment.class */
public final class PlayerFeedbackFragment extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PlayerReportLayout f80645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View f80646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public d f80647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f80648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f80649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f80650g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f80651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f80652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public a f80653k;
    public boolean h = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final b f80654l = new b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/PlayerFeedbackFragment$a.class */
    public interface a {
        void onFinish();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/PlayerFeedbackFragment$b.class */
    public static final class b implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerFeedbackFragment f80655a;

        public b(PlayerFeedbackFragment playerFeedbackFragment) {
            this.f80655a = playerFeedbackFragment;
        }

        @Override // com.bilibili.playerbizcommon.widget.function.feedback.d.a
        public final void onFailed() {
            PlayerFeedbackFragment playerFeedbackFragment = this.f80655a;
            if (playerFeedbackFragment.isAdded()) {
                playerFeedbackFragment.hf(playerFeedbackFragment.getString(2131847111));
                a aVar = playerFeedbackFragment.f80653k;
                if (aVar != null) {
                    aVar.onFinish();
                }
            }
        }

        @Override // com.bilibili.playerbizcommon.widget.function.feedback.d.a
        public final void onSuccess() {
            PlayerFeedbackFragment playerFeedbackFragment = this.f80655a;
            if (playerFeedbackFragment.isAdded()) {
                playerFeedbackFragment.hf(playerFeedbackFragment.getString(2131847384));
                a aVar = playerFeedbackFragment.f80653k;
                if (aVar != null) {
                    aVar.onFinish();
                }
            }
        }
    }

    public final void hf(String str) {
        if (this.h) {
            ToastHelper.showToastShort(BiliContext.application(), str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131494155, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(2131299774);
        View viewInflate2 = layoutInflater.inflate(2131494156, viewGroup2, false);
        if (viewGroup2 != viewInflate2) {
            if (viewInflate2.getParent() == null) {
                viewGroup2.addView(viewInflate2);
            } else if (viewInflate2.getParent() != viewGroup2) {
                throw new IllegalStateException("The specified custom view already has a parent.");
            }
        }
        return viewInflate;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Context context;
        TintButton tintButton;
        final PlayerReportLayout playerReportLayout;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (context = getContext()) == null) {
            return;
        }
        this.f80649f = arguments.getLong("key_avid", 0L);
        this.f80650g = arguments.getLong("key_cid", 0L);
        arguments.getLong("key_season_id", 0L);
        arguments.getBoolean("key_is_bangumi", false);
        this.f80651i = arguments.getBoolean("key_is_show_bangumi_skip_head_option", false);
        this.f80652j = arguments.getBoolean("key_from_player", false);
        arguments.getString("key_player_tag");
        arguments.getString("key_spmid");
        arguments.getString("key_from_spmid");
        int i7 = arguments.getInt("theme");
        if (this.f80649f == 0 || this.f80650g == 0) {
            hf(getString(2131832822));
            a aVar = this.f80653k;
            if (aVar != null) {
                aVar.onFinish();
                return;
            }
            return;
        }
        this.f80645b = (PlayerReportLayout) view.findViewById(2131309061);
        View viewFindViewById = view.findViewById(2131303590);
        this.f80646c = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(4);
        }
        this.f80648e = (TextView) view.findViewById(2131302684);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(2131297809);
        final TintButton tintButton2 = new TintButton(context);
        linearLayout.setGravity(1);
        tintButton2.setText(2131841373);
        tintButton2.setGravity(17);
        tintButton2.setEnabled(false);
        tintButton2.setTextColor(getResources().getColor(R$color.Ga2));
        final TintButton tintButton3 = new TintButton(context);
        tintButton3.setText(getString(2131845454));
        tintButton3.setTextColor(getResources().getColor(2131101419));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130970427});
        tintButton3.setBackgroundResource(typedArrayObtainStyledAttributes.getResourceId(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        tintButton3.setTextSize(2, 12.0f);
        if (this.f80652j) {
            TextView textView = this.f80648e;
            if (textView != null) {
                textView.setTextSize(2, 14.0f);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = GravityCompat.END;
            tintButton3.setLayoutParams(layoutParams);
            tintButton3.setPadding(0, 0, 0, 0);
            linearLayout.addView(tintButton3);
            if (i7 == 1) {
                tintButton2.setBackgroundResource(2131239246);
            } else if (i7 == 2) {
                tintButton2.setBackgroundResource(2131239245);
            } else if (i7 != 3) {
                tintButton2.setBackgroundResource(2131239246);
            } else {
                tintButton2.setBackgroundResource(2131239247);
            }
            tintButton2.setTextSize(2, 16.0f);
            tintButton2.setTextColor(getResources().getColor(2131101422));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) LA.f.a(44.0f, 1));
            layoutParams2.bottomMargin = (int) LA.f.a(33.0f, 1);
            layoutParams2.topMargin = (int) LA.f.a(12.0f, 1);
            tintButton2.setLayoutParams(layoutParams2);
            linearLayout.addView(tintButton2);
        } else {
            TextView textView2 = this.f80648e;
            if (textView2 != null) {
                textView2.setTextSize(2, 12.0f);
            }
            if (i7 == 1) {
                tintButton2.setBackgroundResource(2131239249);
            } else if (i7 == 2) {
                tintButton2.setBackgroundResource(2131239248);
            } else if (i7 != 3) {
                tintButton2.setBackgroundResource(2131239249);
            } else {
                tintButton2.setBackgroundResource(2131239250);
            }
            tintButton2.setTextSize(2, 16.0f);
            tintButton2.setTextColor(getResources().getColor(2131101422));
            tintButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) LA.f.a(44.0f, 1)));
            linearLayout.addView(tintButton2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.topMargin = (int) LA.f.a(18.0f, 1);
            layoutParams3.bottomMargin = (int) LA.f.a(19.0f, 1);
            layoutParams3.gravity = 17;
            tintButton3.setLayoutParams(layoutParams3);
            linearLayout.addView(tintButton3);
        }
        PlayerReportLayout playerReportLayout2 = this.f80645b;
        if (playerReportLayout2 != null) {
            playerReportLayout2.setCheckedStatusListener(new CompoundButton.OnCheckedChangeListener(this, tintButton2) { // from class: com.bilibili.playerbizcommon.widget.function.feedback.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayerFeedbackFragment f80663a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TintButton f80664b;

                {
                    this.f80663a = this;
                    this.f80664b = tintButton2;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                    PlayerFeedbackFragment playerFeedbackFragment = this.f80663a;
                    TintButton tintButton4 = this.f80664b;
                    if (playerFeedbackFragment.isAdded() && z6) {
                        tintButton4.setEnabled(true);
                        tintButton4.setTextColor(playerFeedbackFragment.getResources().getColor(2131101423));
                    }
                }
            });
        }
        String[] stringArray = getResources().getStringArray(2130903043);
        String[] stringArray2 = getResources().getStringArray(2130903044);
        ArrayList<UserFeedbackTag> arrayList = new ArrayList();
        int length = stringArray.length;
        for (int i8 = 0; i8 < length && (!Intrinsics.areEqual(stringArray[i8], "80") || this.f80651i); i8++) {
            arrayList.add(new UserFeedbackTag(stringArray[i8], stringArray2[i8]));
        }
        if (arrayList.size() <= 0 || (playerReportLayout = this.f80645b) == null) {
            tintButton = tintButton2;
        } else {
            boolean z6 = this.f80652j;
            playerReportLayout.setFocusable(false);
            playerReportLayout.setFocusableInTouchMode(false);
            int size = arrayList.size();
            if (size > 0) {
                int iIntValue = new BigDecimal(size).divide(new BigDecimal(z6 ? 2 : 1), 4).intValue();
                ArrayList arrayList2 = new ArrayList(iIntValue);
                for (int i9 = 0; i9 < iIntValue; i9++) {
                    LinearLayout linearLayout2 = new LinearLayout(playerReportLayout.getContext());
                    linearLayout2.setHorizontalGravity(0);
                    arrayList2.add(linearLayout2);
                }
                int i10 = 0;
                for (UserFeedbackTag userFeedbackTag : arrayList) {
                    Object id = userFeedbackTag.getId();
                    CharSequence name = userFeedbackTag.getName();
                    TintRadioButton tintRadioButton = new TintRadioButton(playerReportLayout.getContext());
                    tintRadioButton.setText(name);
                    tintRadioButton.setTextAppearance(playerReportLayout.getContext(), 2131887653);
                    if (z6) {
                        tintRadioButton.setTextColorById(R.color.white);
                    } else {
                        tintRadioButton.setTextColorById(2131103296);
                    }
                    tintRadioButton.setCompoundButtonTintList(2131103565);
                    tintRadioButton.setTag(id);
                    tintRadioButton.setTag(2131298661, name);
                    tintRadioButton.setGravity(16);
                    tintRadioButton.setTextSize(2, 14.0f);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, (int) LA.f.a(36.0f, 1), 1.0f);
                    layoutParams4.gravity = 17;
                    tintRadioButton.setLayoutParams(layoutParams4);
                    tintRadioButton.setPadding((int) TypedValue.applyDimension(1, 6.0f, Resources.getSystem().getDisplayMetrics()), 0, 0, 0);
                    tintRadioButton.setOnClickListener(playerReportLayout);
                    tintRadioButton.setChecked(false);
                    LinearLayout linearLayout3 = (LinearLayout) arrayList2.get((int) Math.floor(((double) i10) / ((double) (z6 ? 2.0f : 1.0f))));
                    linearLayout3.addView(tintRadioButton, layoutParams4);
                    ((ArrayList) playerReportLayout.f80657a).add(tintRadioButton);
                    if (!z6 || i10 % 2 != 0 || i10 == size - 1) {
                        playerReportLayout.addView(linearLayout3);
                    }
                    tintRadioButton.setOnCheckedChangeListener(playerReportLayout.f80662f);
                    i10++;
                }
                LinearLayout linearLayout4 = new LinearLayout(playerReportLayout.getContext());
                linearLayout4.setHorizontalGravity(0);
                linearLayout4.setGravity(17);
                TintRadioButton tintRadioButton2 = new TintRadioButton(playerReportLayout.getContext());
                playerReportLayout.f80660d = tintRadioButton2;
                tintRadioButton2.setText(2131841451);
                TintRadioButton tintRadioButton3 = playerReportLayout.f80660d;
                if (tintRadioButton3 != null) {
                    tintRadioButton3.setTextAppearance(playerReportLayout.getContext(), 2131887653);
                }
                if (z6) {
                    TintRadioButton tintRadioButton4 = playerReportLayout.f80660d;
                    if (tintRadioButton4 != null) {
                        tintRadioButton4.setTextColorById(R.color.white);
                    }
                } else {
                    TintRadioButton tintRadioButton5 = playerReportLayout.f80660d;
                    if (tintRadioButton5 != null) {
                        tintRadioButton5.setTextColorById(2131103296);
                    }
                }
                TintRadioButton tintRadioButton6 = playerReportLayout.f80660d;
                if (tintRadioButton6 != null) {
                    tintRadioButton6.setCompoundButtonTintList(2131103565);
                }
                TintRadioButton tintRadioButton7 = playerReportLayout.f80660d;
                if (tintRadioButton7 != null) {
                    tintRadioButton7.setTag("189");
                }
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.topMargin = (int) LA.f.a(4.0f, 1);
                layoutParams5.bottomMargin = (int) LA.f.a(4.0f, 1);
                layoutParams5.gravity = 17;
                TintRadioButton tintRadioButton8 = playerReportLayout.f80660d;
                if (tintRadioButton8 != null) {
                    tintRadioButton8.setLayoutParams(layoutParams5);
                }
                TintRadioButton tintRadioButton9 = playerReportLayout.f80660d;
                if (tintRadioButton9 != null) {
                    tintRadioButton9.setPadding((int) LA.f.a(6.0f, 1), 0, 0, 0);
                }
                TintRadioButton tintRadioButton10 = playerReportLayout.f80660d;
                if (tintRadioButton10 != null) {
                    tintRadioButton10.setOnClickListener(playerReportLayout);
                }
                TintRadioButton tintRadioButton11 = playerReportLayout.f80660d;
                if (tintRadioButton11 != null) {
                    tintRadioButton11.setChecked(false);
                }
                TintRadioButton tintRadioButton12 = playerReportLayout.f80660d;
                if (tintRadioButton12 != null) {
                    ((ArrayList) playerReportLayout.f80657a).add(tintRadioButton12);
                }
                linearLayout4.addView(playerReportLayout.f80660d);
                TintRadioButton tintRadioButton13 = playerReportLayout.f80660d;
                if (tintRadioButton13 != null) {
                    tintRadioButton13.setOnCheckedChangeListener(playerReportLayout.f80662f);
                }
                TintEditText tintEditText = new TintEditText(playerReportLayout.getContext());
                playerReportLayout.f80661e = tintEditText;
                tintEditText.setOnClickListener(playerReportLayout);
                TintEditText tintEditText2 = playerReportLayout.f80661e;
                if (tintEditText2 != null) {
                    tintEditText2.setSingleLine();
                }
                TintEditText tintEditText3 = playerReportLayout.f80661e;
                if (tintEditText3 != null) {
                    tintEditText3.setHint(2131845858);
                }
                TintEditText tintEditText4 = playerReportLayout.f80661e;
                if (tintEditText4 != null) {
                    tintEditText4.setMaxEms(200);
                }
                TintEditText tintEditText5 = playerReportLayout.f80661e;
                if (tintEditText5 != null) {
                    tintEditText5.setTextSize(14.0f);
                }
                if (z6) {
                    TintEditText tintEditText6 = playerReportLayout.f80661e;
                    if (tintEditText6 != null) {
                        tintEditText6.setTextColor(playerReportLayout.getResources().getColor(R.color.white));
                    }
                    TintEditText tintEditText7 = playerReportLayout.f80661e;
                    if (tintEditText7 != null) {
                        tintEditText7.setHintTextColor(playerReportLayout.getResources().getColor(2131101466));
                    }
                } else {
                    TintEditText tintEditText8 = playerReportLayout.f80661e;
                    if (tintEditText8 != null) {
                        tintEditText8.setTextColor(playerReportLayout.getResources().getColor(2131103296));
                    }
                    TintEditText tintEditText9 = playerReportLayout.f80661e;
                    if (tintEditText9 != null) {
                        tintEditText9.setHintTextColor(playerReportLayout.getResources().getColor(2131103980));
                    }
                }
                TintEditText tintEditText10 = playerReportLayout.f80661e;
                if (tintEditText10 != null) {
                    tintEditText10.setMinimumWidth((int) LA.f.a(120.0f, 1));
                }
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams6.bottomMargin = (int) LA.f.a(2.0f, 1);
                layoutParams6.topMargin = (int) LA.f.a(0.0f, 1);
                layoutParams6.leftMargin = (int) LA.f.a(20.0f, 1);
                TintEditText tintEditText11 = playerReportLayout.f80661e;
                if (tintEditText11 != null) {
                    tintEditText11.setLayoutParams(layoutParams6);
                }
                TintEditText tintEditText12 = playerReportLayout.f80661e;
                if (tintEditText12 != null) {
                    tintEditText12.setBackgroundDrawable(playerReportLayout.getResources().getDrawable(2131234812));
                }
                TintEditText tintEditText13 = playerReportLayout.f80661e;
                ThemeUtils.tintDrawable(tintEditText13 != null ? tintEditText13.getBackground() : null, playerReportLayout.getResources().getColor(2131103980));
                TintEditText tintEditText14 = playerReportLayout.f80661e;
                if (tintEditText14 != null) {
                    tintEditText14.setCursorVisible(false);
                }
                TintEditText tintEditText15 = playerReportLayout.f80661e;
                if (tintEditText15 != null) {
                    tintEditText15.setOnTouchListener(new View.OnTouchListener(playerReportLayout) { // from class: com.bilibili.playerbizcommon.widget.function.feedback.g

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final PlayerReportLayout f80681a;

                        {
                            this.f80681a = playerReportLayout;
                        }

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            PlayerReportLayout playerReportLayout3 = this.f80681a;
                            int i11 = PlayerReportLayout.f80656g;
                            playerReportLayout3.onClick(view2);
                            return false;
                        }
                    });
                }
                TintEditText tintEditText16 = playerReportLayout.f80661e;
                if (tintEditText16 != null) {
                    tintEditText16.setOnEditorActionListener(new TextView.OnEditorActionListener(playerReportLayout) { // from class: com.bilibili.playerbizcommon.widget.function.feedback.h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final PlayerReportLayout f80682a;

                        {
                            this.f80682a = playerReportLayout;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                            boolean z7;
                            PlayerReportLayout playerReportLayout3 = this.f80682a;
                            int i12 = PlayerReportLayout.f80656g;
                            if (i11 == 2 || i11 == 4 || i11 == 5 || i11 == 6) {
                                InputMethodManagerHelper.hideSoftInput(playerReportLayout3.getContext(), playerReportLayout3.f80661e, 2);
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            return z7;
                        }
                    });
                }
                linearLayout4.addView(playerReportLayout.f80661e);
                playerReportLayout.addView(linearLayout4);
            }
            PlayerReportLayout playerReportLayout3 = this.f80645b;
            tintButton = tintButton2;
            if (playerReportLayout3 != null) {
                playerReportLayout3.setVisibility(0);
                tintButton = tintButton2;
            }
        }
        tintButton3.setOnClickListener(new XD.h(this, 2));
        final TintButton tintButton4 = tintButton;
        tintButton.setOnClickListener(new View.OnClickListener(this, tintButton4, tintButton3) { // from class: com.bilibili.playerbizcommon.widget.function.feedback.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerFeedbackFragment f80665a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TintButton f80666b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TintButton f80667c;

            {
                this.f80665a = this;
                this.f80666b = tintButton4;
                this.f80667c = tintButton3;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PlayerFeedbackFragment playerFeedbackFragment = this.f80665a;
                TintButton tintButton5 = this.f80666b;
                TintButton tintButton6 = this.f80667c;
                if (playerFeedbackFragment.isAdded() && playerFeedbackFragment.f80647d == null) {
                    if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
                        playerFeedbackFragment.hf(playerFeedbackFragment.getString(2131832822));
                        return;
                    }
                    long jNow = ServerClock.now();
                    if (jNow > 0 && Math.abs(System.currentTimeMillis() - jNow) >= 86400000) {
                        playerFeedbackFragment.hf(playerFeedbackFragment.getString(2131845421));
                        return;
                    }
                    PlayerReportLayout playerReportLayout4 = playerFeedbackFragment.f80645b;
                    if (playerReportLayout4 == null || !playerReportLayout4.isShown()) {
                        return;
                    }
                    PlayerReportLayout playerReportLayout5 = playerFeedbackFragment.f80645b;
                    String reportId = playerReportLayout5 != null ? playerReportLayout5.getReportId() : null;
                    PlayerReportLayout playerReportLayout6 = playerFeedbackFragment.f80645b;
                    String reportContent = playerReportLayout6 != null ? playerReportLayout6.getReportContent() : null;
                    if (TextUtils.isEmpty(reportId)) {
                        playerFeedbackFragment.hf(playerFeedbackFragment.getResources().getString(2131846772));
                        return;
                    }
                    if (TextUtils.equals(reportId, "189")) {
                        PlayerReportLayout playerReportLayout7 = playerFeedbackFragment.f80645b;
                        reportContent = null;
                        if (playerReportLayout7 != null) {
                            reportContent = playerReportLayout7.getOtherStr();
                        }
                        if (reportContent != null && reportContent.length() < 2) {
                            playerFeedbackFragment.hf(playerFeedbackFragment.getResources().getString(2131847267));
                            return;
                        }
                    }
                    PlayerReportLayout playerReportLayout8 = playerFeedbackFragment.f80645b;
                    if (playerReportLayout8 != null) {
                        playerReportLayout8.setVisibility(4);
                    }
                    View view3 = playerFeedbackFragment.f80646c;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                    TextView textView3 = playerFeedbackFragment.f80648e;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    if (playerFeedbackFragment.f80647d == null) {
                        tintButton5.setEnabled(false);
                        tintButton6.setEnabled(false);
                        playerFeedbackFragment.getContext();
                        d dVar = new d(playerFeedbackFragment.f80654l, reportId, reportContent, playerFeedbackFragment.f80649f, playerFeedbackFragment.f80650g);
                        playerFeedbackFragment.f80647d = dVar;
                        AsyncTask.THREAD_POOL_EXECUTOR.execute(dVar);
                        if (reportId != null) {
                            l.a("feedback_type", reportId, "player.player.full-more-feedback.menu.click", true);
                            return;
                        }
                        return;
                    }
                    tintButton5.setEnabled(true);
                    tintButton6.setEnabled(true);
                    PlayerReportLayout playerReportLayout9 = playerFeedbackFragment.f80645b;
                    if (playerReportLayout9 != null) {
                        playerReportLayout9.setVisibility(0);
                    }
                    View view4 = playerFeedbackFragment.f80646c;
                    if (view4 != null) {
                        view4.setVisibility(4);
                    }
                    TextView textView4 = playerFeedbackFragment.f80648e;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                }
            }
        });
    }
}
