package com.bilibili.playerbizcommon.input.panels.commandsdetail.cmtime;

import Eq0.e;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C3259x;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bilibili.bililive.infra.trace.LiveReporter;
import com.bilibili.bililive.room.ui.common.user.card.LiveFeedRoomAnchorCardFragment;
import com.bilibili.bililive.room.ui.roomv3.user.card.LiveRoomCardViewModel;
import com.bilibili.bililive.videoliveplayer.net.beans.card.BiliLiveAnchorCardInfo;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommon.input.panels.commandsdetail.cmtime.TimePickerDialog;
import com.bilibili.playerbizcommon.widget.function.timer.PlayerTimePicker;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.utils.TimeFormater;
import y0.C9014b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/commandsdetail/cmtime/TimePickerDialog.class */
public final class TimePickerDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ImageView f80124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f80125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public LinearLayout f80126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public e.a f80127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public PlayerTimePicker f80128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public PlayerTimePicker f80129g;

    @Nullable
    public PlayerTimePicker h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/commandsdetail/cmtime/TimePickerDialog$a.class */
    public static final class a implements PlayerTimePicker.d {
        @Override // com.bilibili.playerbizcommon.widget.function.timer.PlayerTimePicker.d
        public final String format(int i7) {
            return (i7 < 0 || i7 >= 10) ? String.valueOf(i7) : C3259x.a(i7, "0");
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        dismissAllowingStateLoss();
    }

    public final int hf() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getInt("time_picker_dialog_height") : NewPlayerUtilsKt.toPx(300.0f);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != 1) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Dialog dialog = getDialog();
        View viewInflate = null;
        if (dialog != null) {
            Window window = dialog.getWindow();
            viewInflate = null;
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(window.getContext().getResources().getColor(R$color.f64616Wh0)));
                window.setWindowAnimations(2131886233);
                window.getDecorView().setPadding(0, 0, 0, 0);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.height = hf();
                attributes.gravity = 80;
                window.setAttributes(attributes);
                viewInflate = layoutInflater.inflate(2131493842, viewGroup, false);
                this.f80124b = (ImageView) viewInflate.findViewById(2131296853);
                this.f80125c = (TextView) viewInflate.findViewById(2131298598);
                this.f80126d = (LinearLayout) viewInflate.findViewById(2131308868);
                TextView textView = (TextView) viewInflate.findViewById(2131308958);
                Bundle arguments = getArguments();
                String string = null;
                if (arguments != null) {
                    string = arguments.getString("time_picker_dialog_title");
                }
                textView.setText(string);
            }
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f80127e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v80, types: [com.bilibili.playerbizcommon.widget.function.timer.PlayerTimePicker$d, java.lang.Object] */
    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        final e.a aVar;
        Fq0.e eVar;
        super.onStart();
        Context context = getContext();
        if (context == null || (aVar = this.f80127e) == null) {
            return;
        }
        ImageView imageView = this.f80124b;
        if (imageView != null) {
            final int i7 = 0;
            imageView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: Eq0.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f4693a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DialogFragment f4694b;

                {
                    this.f4693a = i7;
                    this.f4694b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f4693a) {
                        case 0:
                            ((TimePickerDialog) this.f4694b).dismissAllowingStateLoss();
                            break;
                        default:
                            LiveFeedRoomAnchorCardFragment liveFeedRoomAnchorCardFragment = this.f4694b;
                            LiveFeedRoomAnchorCardFragment.a aVar2 = liveFeedRoomAnchorCardFragment.B;
                            if (aVar2 != null) {
                                BiliLiveAnchorCardInfo biliLiveAnchorCardInfo = aVar2.b;
                                Function1 function1 = liveFeedRoomAnchorCardFragment.D;
                                if (function1 != null) {
                                    function1.invoke(biliLiveAnchorCardInfo);
                                }
                            }
                            zH.a aVar3 = liveFeedRoomAnchorCardFragment.x;
                            if (aVar3 != null) {
                                LiveRoomCardViewModel liveRoomCardViewModel = aVar3.a;
                                liveRoomCardViewModel.getClass();
                                LiveReporter.reportClick$default("live.live-room-detail.upcard.send-gift.click", YG.b.d(liveRoomCardViewModel.L1().i, new HashMap()), false, 4, (Object) null);
                            }
                            liveFeedRoomAnchorCardFragment.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
        }
        TextView textView = this.f80125c;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener(aVar, this) { // from class: Eq0.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final e.a f4695a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TimePickerDialog f4696b;

                {
                    this.f4695a = aVar;
                    this.f4696b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.a aVar2 = this.f4695a;
                    TimePickerDialog timePickerDialog = this.f4696b;
                    PlayerTimePicker playerTimePicker = timePickerDialog.f80128f;
                    int mCurrentValue = 0;
                    int mCurrentValue2 = playerTimePicker != null ? playerTimePicker.getMCurrentValue() : 0;
                    PlayerTimePicker playerTimePicker2 = timePickerDialog.f80129g;
                    int mCurrentValue3 = playerTimePicker2 != null ? playerTimePicker2.getMCurrentValue() : 0;
                    PlayerTimePicker playerTimePicker3 = timePickerDialog.h;
                    if (playerTimePicker3 != null) {
                        mCurrentValue = playerTimePicker3.getMCurrentValue();
                    }
                    aVar2.getClass();
                    String time$default = TimeFormater.formatTime$default(TimeFormater.INSTANCE, 1000 * ((long) C9014b.a(mCurrentValue3, 60, mCurrentValue2 * 3600, mCurrentValue)), false, false, 6, (Object) null);
                    boolean z6 = aVar2.f4685b;
                    e eVar2 = aVar2.f4684a;
                    if (z6) {
                        Fq0.e eVar3 = eVar2.f4682e;
                        if (eVar3 != null) {
                            eVar3.b(eVar2.f4680c, time$default);
                        }
                    } else {
                        Fq0.e eVar4 = eVar2.f4683f;
                        if (eVar4 != null) {
                            eVar4.b(eVar2.f4681d, time$default);
                        }
                    }
                    timePickerDialog.dismissAllowingStateLoss();
                }
            });
        }
        TimeFormater timeFormater = TimeFormater.INSTANCE;
        e eVar2 = aVar.f4684a;
        List listAsReversed = CollectionsKt.asReversed(StringsKt.R(TimeFormater.formatTime$default(timeFormater, eVar2.f4679b.a().f20949b, false, false, 6, (Object) null), new String[]{":"}, 0, 6));
        Integer intOrNull = StringsKt.toIntOrNull((String) (2 < listAsReversed.size() ? listAsReversed.get(2) : "0"));
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        Integer intOrNull2 = StringsKt.toIntOrNull((String) (1 < listAsReversed.size() ? listAsReversed.get(1) : "0"));
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
        Integer intOrNull3 = StringsKt.toIntOrNull((String) (listAsReversed.size() > 0 ? listAsReversed.get(0) : "0"));
        int iIntValue3 = intOrNull3 != null ? intOrNull3.intValue() : 0;
        String draft$playerbizcommon_apinkRelease = null;
        if (aVar.f4685b) {
            Fq0.e eVar3 = eVar2.f4682e;
            if (eVar3 != null) {
                eVar = eVar3;
                draft$playerbizcommon_apinkRelease = eVar.getDraft$playerbizcommon_apinkRelease();
            }
        } else {
            Fq0.e eVar4 = eVar2.f4683f;
            if (eVar4 != null) {
                eVar = eVar4;
                draft$playerbizcommon_apinkRelease = eVar.getDraft$playerbizcommon_apinkRelease();
            }
        }
        String str = draft$playerbizcommon_apinkRelease;
        if (draft$playerbizcommon_apinkRelease == null) {
            str = "";
        }
        List listAsReversed2 = CollectionsKt.asReversed(StringsKt.R(str, new String[]{":"}, 0, 6));
        Integer intOrNull4 = StringsKt.toIntOrNull((String) (2 < listAsReversed2.size() ? listAsReversed2.get(2) : "0"));
        int iIntValue4 = intOrNull4 != null ? intOrNull4.intValue() : 0;
        Integer intOrNull5 = StringsKt.toIntOrNull((String) (1 < listAsReversed2.size() ? listAsReversed2.get(1) : "0"));
        int iIntValue5 = intOrNull5 != null ? intOrNull5.intValue() : 0;
        Integer intOrNull6 = StringsKt.toIntOrNull((String) (listAsReversed2.size() > 0 ? listAsReversed2.get(0) : "0"));
        int iIntValue6 = intOrNull6 != null ? intOrNull6.intValue() : 0;
        ?? obj = new Object();
        if (iIntValue > 0) {
            PlayerTimePicker playerTimePicker = new PlayerTimePicker(context);
            playerTimePicker.setFormatter((PlayerTimePicker.d) obj);
            playerTimePicker.setMinValue(0);
            playerTimePicker.setMaxValue(iIntValue);
            playerTimePicker.setCurrentValue(iIntValue4);
            playerTimePicker.setTextColorResource(R$color.Text1);
            playerTimePicker.setTextSize(18.0f);
            playerTimePicker.setSelectedTextColorResource(R$color.Text1);
            playerTimePicker.setSelectedTextSize(18.0f);
            LinearLayout linearLayout = this.f80126d;
            if (linearLayout != null) {
                linearLayout.addView(playerTimePicker);
            }
            LinearLayout linearLayout2 = this.f80126d;
            if (linearLayout2 != null) {
                TextView textView2 = new TextView(context);
                textView2.setText(":");
                textView2.setTextSize(18.0f);
                textView2.setTextColor(context.getResources().getColor(R$color.Text1));
                linearLayout2.addView(textView2);
            }
            this.f80128f = playerTimePicker;
            ViewGroup.LayoutParams layoutParams = playerTimePicker.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = hf() - NewPlayerUtilsKt.toPx(64);
            playerTimePicker.setLayoutParams(layoutParams);
        }
        PlayerTimePicker playerTimePicker2 = new PlayerTimePicker(context);
        playerTimePicker2.setFormatter((PlayerTimePicker.d) obj);
        playerTimePicker2.setMinValue(0);
        playerTimePicker2.setMaxValue(iIntValue > 0 ? 59 : iIntValue2);
        playerTimePicker2.setCurrentValue(iIntValue5);
        playerTimePicker2.setTextColorResource(R$color.Text1);
        playerTimePicker2.setTextSize(18.0f);
        playerTimePicker2.setSelectedTextColorResource(R$color.Text1);
        playerTimePicker2.setSelectedTextSize(18.0f);
        LinearLayout linearLayout3 = this.f80126d;
        if (linearLayout3 != null) {
            linearLayout3.addView(playerTimePicker2);
        }
        LinearLayout linearLayout4 = this.f80126d;
        if (linearLayout4 != null) {
            TextView textView3 = new TextView(context);
            textView3.setText(":");
            textView3.setTextSize(18.0f);
            textView3.setTextColor(context.getResources().getColor(R$color.Text1));
            linearLayout4.addView(textView3);
        }
        this.f80129g = playerTimePicker2;
        ViewGroup.LayoutParams layoutParams2 = playerTimePicker2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = hf() - NewPlayerUtilsKt.toPx(64);
        playerTimePicker2.setLayoutParams(layoutParams2);
        PlayerTimePicker playerTimePicker3 = new PlayerTimePicker(context);
        playerTimePicker3.setFormatter((PlayerTimePicker.d) obj);
        playerTimePicker3.setMinValue(0);
        if (iIntValue2 > 0 || iIntValue > 0) {
            iIntValue3 = 59;
        }
        playerTimePicker3.setMaxValue(iIntValue3);
        playerTimePicker3.setCurrentValue(iIntValue6);
        playerTimePicker3.setTextColorResource(R$color.Text1);
        playerTimePicker3.setTextSize(18.0f);
        playerTimePicker3.setSelectedTextColorResource(R$color.Text1);
        playerTimePicker3.setSelectedTextSize(18.0f);
        LinearLayout linearLayout5 = this.f80126d;
        if (linearLayout5 != null) {
            linearLayout5.addView(playerTimePicker3);
        }
        this.h = playerTimePicker3;
        ViewGroup.LayoutParams layoutParams3 = playerTimePicker3.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.height = hf() - NewPlayerUtilsKt.toPx(64);
        playerTimePicker3.setLayoutParams(layoutParams3);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void showNow(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        if (fragmentManager.isStateSaved()) {
            return;
        }
        super.showNow(fragmentManager, str);
    }
}
