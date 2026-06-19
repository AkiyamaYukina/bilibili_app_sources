package com.bilibili.mini.player.common.utils;

import F3.J2;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.foundation.text.C0;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.TintTextView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import uh0.C8734c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/utils/i.class */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f66107a = LazyKt.lazy(new J2(6));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final List<String> f66108b = CollectionsKt.listOf(new String[]{"united_detail_page", "ugc_detail_page", "ogv_detail_page", "live_room_page", "story_page", "multi_type_detail_page", "music_podcast_page", "live_blink_page", "capture_page", "game_detail_page", "game_home_page", "cheese_detail_page", "login_page", "vip_page", "together_page", "play_set_create_page", "ogv_review_page", "ogv_feedback_page"});

    public static final void a() {
        BLRouter bLRouter = BLRouter.INSTANCE;
        o00.a.a();
        Iterator it = bLRouter.getServices(com.bilibili.mini.player.common.manager.a.class).getAll().entrySet().iterator();
        while (it.hasNext()) {
            ((com.bilibili.mini.player.common.manager.a) ((Map.Entry) it.next()).getValue()).a();
        }
    }

    @Nullable
    public static final Object b(@NotNull C8734c c8734c, @NotNull vh0.c cVar, @NotNull Context context, @NotNull Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new MiniPlayerUtilsKt$getPanelSuspend$2(c8734c, cVar, context, null), continuation);
    }

    public static final boolean c() {
        SharedPreferences bLKVSharedPreference;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutInt;
        SharedPreferences bLKVSharedPreference2 = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
        boolean z6 = false;
        int i7 = bLKVSharedPreference2 != null ? bLKVSharedPreference2.getInt("sp_mini_player_v2_first_show", 0) : 0;
        if (i7 < 2 && (bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference()) != null && (editorEdit = bLKVSharedPreference.edit()) != null && (editorPutInt = editorEdit.putInt("sp_mini_player_v2_first_show", i7 + 1)) != null) {
            editorPutInt.apply();
        }
        if (i7 < 2) {
            z6 = true;
        }
        return z6;
    }

    public static final void d() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutLong;
        Long longOrNull;
        Integer intOrNull;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
        long j7 = 0;
        if (bLKVSharedPreference != null) {
            j7 = bLKVSharedPreference.getLong("pref_key_last_close_hint_shown_time", 0L);
        }
        ConfigManager.Companion companion = ConfigManager.Companion;
        String str = (String) Contract.get$default(companion.config(), "videodetail.miniplayer_close_hint_reset_duration", (Object) null, 2, (Object) null);
        int iIntValue = (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 365 : intOrNull.intValue();
        StringBuilder sbA = z.a(j7, "last show time: ", ", current: ");
        sbA.append(jCurrentTimeMillis);
        sbA.append(", resetDuration(day): ");
        sbA.append(iIntValue);
        BLog.i("MiniPlayerManager", sbA.toString());
        if (jCurrentTimeMillis - j7 >= ((long) (iIntValue * 86400)) * 1000) {
            com.bilibili.mini.player.common.manager.e.f66066b.getClass();
            final View viewInflate = LayoutInflater.from(com.bilibili.mini.player.common.manager.e.f66069e).inflate(2131500608, (ViewGroup) null);
            final WindowManager windowManagerL = com.bilibili.mini.player.common.manager.e.c().l();
            final c cVar = new c(0, viewInflate, windowManagerL);
            Neurons.reportExposure$default(true, "main.play-setting.miniplayer.toast.show", (Map) null, (List) null, 12, (Object) null);
            TintTextView tintTextView = (TintTextView) viewInflate.findViewById(2131307515);
            if (MultipleThemeUtils.isNightTheme(tintTextView.getContext())) {
                tintTextView.setTextColor(Color.parseColor("#FFE7E9EB"));
            } else {
                tintTextView.setTextColor(Color.parseColor("#FF18191C"));
            }
            viewInflate.findViewById(2131307512).setOnClickListener(new View.OnClickListener(windowManagerL, viewInflate, cVar) { // from class: com.bilibili.mini.player.common.utils.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final WindowManager f66096a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final View f66097b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final c f66098c;

                {
                    this.f66096a = windowManagerL;
                    this.f66097b = viewInflate;
                    this.f66098c = cVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WindowManager windowManager = this.f66096a;
                    View view2 = this.f66097b;
                    final c cVar2 = this.f66098c;
                    if (windowManager != null) {
                        windowManager.removeView(view2);
                    }
                    final int i7 = 0;
                    view2.removeCallbacks(new Runnable(cVar2, i7) { // from class: com.bilibili.mini.player.common.utils.g

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f66104a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Function0 f66105b;

                        {
                            this.f66104a = i7;
                            this.f66105b = cVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (this.f66104a) {
                                case 0:
                                    ((c) this.f66105b).invoke();
                                    break;
                                default:
                                    this.f66105b.invoke();
                                    break;
                            }
                        }
                    });
                }
            });
            viewInflate.findViewById(2131307513).setOnClickListener(new View.OnClickListener(windowManagerL, viewInflate, cVar) { // from class: com.bilibili.mini.player.common.utils.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final WindowManager f66099a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final View f66100b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final c f66101c;

                {
                    this.f66099a = windowManagerL;
                    this.f66100b = viewInflate;
                    this.f66101c = cVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WindowManager windowManager = this.f66099a;
                    View view2 = this.f66100b;
                    c cVar2 = this.f66101c;
                    if (windowManager != null) {
                        windowManager.removeView(view2);
                    }
                    view2.removeCallbacks(new a70.a(cVar2, 1));
                    Neurons.reportClick$default(true, "main.play-setting.miniplayer.toast.click", (Map) null, 4, (Object) null);
                    RouteRequest routeRequestBuild = new RouteRequest.Builder("activity://main/preference").extras(new Cq0.e(2)).build();
                    com.bilibili.mini.player.common.manager.e.f66066b.getClass();
                    BLRouter.routeTo(routeRequestBuild, com.bilibili.mini.player.common.manager.e.f66069e);
                }
            });
            boolean zB = Rf0.f.b();
            int i7 = !zB ? 2 : Build.VERSION.SDK_INT >= 26 ? 2038 : 2003;
            int i8 = zB ? 16777768 : 40;
            int i9 = StatusBarCompat.getDisplayRealSize(viewInflate.getContext()).x;
            if (windowManagerL != null) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i9, -2, i7, i8, -3);
                layoutParams.gravity = 81;
                Unit unit = Unit.INSTANCE;
                windowManagerL.addView(viewInflate, layoutParams);
            }
            StringBuilder sbA2 = cf.e.a(i7, "show mini player setting guide, hasPermission: ", " windowType: ", " windowFlag: ", zB);
            sbA2.append(i8);
            BLog.i("MiniPlayerManager", sbA2.toString());
            f fVar = new f(cVar, 0);
            String str2 = (String) Contract.get$default(companion.config(), "miniplayer.setting_tips_remaining_time", (Object) null, 2, (Object) null);
            viewInflate.postDelayed(fVar, (str2 == null || (longOrNull = StringsKt.toLongOrNull(str2)) == null) ? 4000L : longOrNull.longValue());
            SharedPreferences bLKVSharedPreference2 = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
            if (bLKVSharedPreference2 != null && (editorEdit = bLKVSharedPreference2.edit()) != null && (editorPutLong = editorEdit.putLong("pref_key_last_close_hint_shown_time", jCurrentTimeMillis)) != null) {
                editorPutLong.apply();
            }
            C0.c(jCurrentTimeMillis, "show close hint, current: ", "MiniPlayerManager");
        }
    }
}
