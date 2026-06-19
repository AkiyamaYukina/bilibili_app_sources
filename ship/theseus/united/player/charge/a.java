package com.bilibili.ship.theseus.united.player.charge;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.autofill.r;
import com.bilibili.ship.theseus.united.page.playviewextra.CountdownItemVo;
import com.bilibili.ship.theseus.united.page.playviewextra.FoldDataVo;
import com.bilibili.ship.theseus.united.page.playviewextra.FoldStyle;
import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vv0.p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/a.class */
@StabilityInferred(parameters = 1)
public final class a implements d {
    @Override // com.bilibili.ship.theseus.united.player.charge.d
    @Nullable
    public final p a(@NotNull FullPromptBarVo fullPromptBarVo, @NotNull String str) {
        p pVar = null;
        FoldDataVo foldDataVo = fullPromptBarVo.f102385g;
        if (foldDataVo != null) {
            FoldStyle foldStyleB = foldDataVo.b();
            CountdownItemVo countdownItemVoA = foldDataVo.a();
            TextVo textVo = countdownItemVoA != null ? countdownItemVoA.f102373b : null;
            CountdownItemVo countdownItemVoA2 = foldDataVo.a();
            TextVo textVoA = null;
            if (countdownItemVoA2 != null) {
                TextVo textVo2 = countdownItemVoA2.f102374c;
                textVoA = null;
                if (textVo2 != null) {
                    if (str.length() == 0) {
                        textVoA = textVo2;
                    } else {
                        StringBuilder sbA = r.a(str);
                        sbA.append(textVo2.f102705a);
                        textVoA = TextVo.a(textVo2, sbA.toString(), null, 65534);
                    }
                }
            }
            pVar = new p(foldStyleB, fullPromptBarVo.f102379a, textVo, textVoA, (TextVo) CollectionsKt.firstOrNull(fullPromptBarVo.f102384f), fullPromptBarVo.f102386i, fullPromptBarVo.f102387j, fullPromptBarVo.h);
        }
        return pVar;
    }

    @Override // com.bilibili.ship.theseus.united.player.charge.d
    @NotNull
    public final p b(@NotNull FullPromptBarVo fullPromptBarVo, @NotNull String str) {
        TextVo textVoA;
        FoldStyle foldStyle = FoldStyle.Countdown;
        String str2 = fullPromptBarVo.f102379a;
        TextVo textVo = fullPromptBarVo.f102381c;
        if (textVo == null) {
            textVoA = null;
        } else if (str.length() == 0) {
            textVoA = textVo;
        } else {
            StringBuilder sbA = r.a(str);
            sbA.append(textVo.f102705a);
            textVoA = TextVo.a(textVo, sbA.toString(), null, 65534);
        }
        return new p(foldStyle, str2, fullPromptBarVo.f102380b, textVoA, (TextVo) CollectionsKt.firstOrNull(fullPromptBarVo.f102384f), fullPromptBarVo.f102386i, fullPromptBarVo.f102387j, fullPromptBarVo.h);
    }
}
