package com.bilibili.ship.theseus.ogv.dubbing;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableArrayList;
import com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProto;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayDubbingInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProto;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLHumanActionParamsType;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/m.class */
@StabilityInferred(parameters = 0)
public final class m extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f91881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ObservableArrayList<Nj0.c> f91882b = new ObservableArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91883c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/m$a.class */
    public static final class a {
        @NotNull
        public static m a(@NotNull Context context, @NotNull q qVar, boolean z6, @NotNull PlayDubbingInfo playDubbingInfo) {
            int iRoundToInt;
            m mVar = new m();
            if (z6 != mVar.f91881a) {
                mVar.f91881a = z6;
                mVar.notifyPropertyChanged(332);
            }
            if (z6) {
                iRoundToInt = -2;
            } else {
                iRoundToInt = MathKt.roundToInt(TypedValue.applyDimension(1, Float.isNaN(270.0f) ? 0.0f : 270.0f, context.getResources().getDisplayMetrics()));
            }
            if (iRoundToInt != mVar.f91883c) {
                mVar.f91883c = iRoundToInt;
                mVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_MAX_SIZE);
            }
            int i7 = 0;
            for (Object obj : playDubbingInfo.getRoleAudioListList()) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                RoleAudioProto roleAudioProto = (RoleAudioProto) obj;
                l lVar = new l();
                if (z6 != lVar.f91876c) {
                    lVar.f91876c = z6;
                    lVar.notifyPropertyChanged(332);
                }
                String roleAvatar = roleAudioProto.getRoleAvatar();
                if (!Intrinsics.areEqual(roleAvatar, lVar.f91877d)) {
                    lVar.f91877d = roleAvatar;
                    lVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_SEGMENT_RESULT_BLUR);
                }
                String roleName = roleAudioProto.getRoleName();
                if (!Intrinsics.areEqual(roleName, lVar.f91878e)) {
                    lVar.f91878e = roleName;
                    lVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE);
                }
                int i8 = 0;
                for (Object obj2 : roleAudioProto.getAudioMaterialListList()) {
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    AudioMaterialProto audioMaterialProto = (AudioMaterialProto) obj2;
                    j jVar = new j();
                    String personAvatar = audioMaterialProto.getPersonAvatar();
                    if (!Intrinsics.areEqual(personAvatar, jVar.f91863d)) {
                        jVar.f91863d = personAvatar;
                        jVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_RESULT_BLUR);
                    }
                    String personName = audioMaterialProto.getPersonName();
                    if (!Intrinsics.areEqual(personName, jVar.f91864e)) {
                        jVar.f91864e = personName;
                        jVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_USE_TEMPERATURE);
                    }
                    String edition = audioMaterialProto.getEdition();
                    if (!Intrinsics.areEqual(edition, jVar.f91865f)) {
                        jVar.f91865f = edition;
                        jVar.notifyPropertyChanged(19);
                    }
                    if (z6 != jVar.f91862c) {
                        jVar.f91862c = z6;
                        jVar.notifyPropertyChanged(332);
                    }
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    float f7 = 4;
                    gradientDrawable.setCornerRadius(Uj0.c.a(f7, context));
                    gradientDrawable.setColor(ContextCompat.getColor(context, 2131101463));
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setCornerRadius(Uj0.c.a(f7, context));
                    gradientDrawable2.setColor(ContextCompat.getColor(context, 2131104044));
                    gradientDrawable2.setStroke(Uj0.c.b(0.5f, context), ContextCompat.getColor(context, R$color.Pi5));
                    GradientDrawable gradientDrawable3 = new GradientDrawable();
                    gradientDrawable3.setCornerRadius(Uj0.c.a(f7, context));
                    gradientDrawable3.setColor(ContextCompat.getColor(context, 2131104044));
                    gradientDrawable3.setStroke(Uj0.c.b(0.5f, context), jVar.f91862c ? Color.parseColor("#46494D") : ContextCompat.getColor(context, R$color.Ga3));
                    stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
                    stateListDrawable.addState(new int[]{R.attr.state_activated}, gradientDrawable2);
                    stateListDrawable.addState(new int[0], gradientDrawable3);
                    if (!Intrinsics.areEqual(stateListDrawable, jVar.h)) {
                        jVar.h = stateListDrawable;
                        jVar.notifyPropertyChanged(20);
                    }
                    jVar.f91867i = new k(lVar, qVar, i8, jVar, audioMaterialProto, context, roleAudioProto, playDubbingInfo);
                    e eVar = (e) ((LinkedHashMap) qVar.f91903s).get(Long.valueOf(roleAudioProto.getRoleId()));
                    if (eVar == null) {
                        AudioMaterialProto audioMaterialProto2 = (AudioMaterialProto) roleAudioProto.getAudioMaterialListList().get(0);
                        eVar = new e(0, audioMaterialProto2.getEdition(), audioMaterialProto2.getAudioList());
                    }
                    String str = eVar.f91847b;
                    String string = str;
                    if (str.length() == 0) {
                        string = context.getString(2131855523);
                    }
                    if (!Intrinsics.areEqual(string, lVar.f91879f)) {
                        lVar.f91879f = string;
                        lVar.notifyPropertyChanged(142);
                    }
                    boolean z7 = i8 == eVar.f91846a;
                    if (z7 != jVar.f91866g) {
                        jVar.f91866g = z7;
                        jVar.notifyPropertyChanged(550);
                    }
                    qVar.f91903s.put(Long.valueOf(roleAudioProto.getRoleId()), eVar);
                    lVar.f91880g.add(jVar);
                    i8++;
                }
                mVar.f91882b.add(lVar);
                i7++;
            }
            return mVar;
        }
    }
}
