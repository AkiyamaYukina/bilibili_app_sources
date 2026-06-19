package com.bilibili.ogv.feedback;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/BangumiFeedbackFragment.class */
public final class BangumiFeedbackFragment extends BaseBangumiFeedbackFragment implements IMiniPlayerContainer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public String f67557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public String f67558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f67559p = 162;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, Integer> f67560q = MapsKt.hashMapOf(new Pair[]{TuplesKt.to(2131309788, 2131856384), TuplesKt.to(2131309789, 2131856371), TuplesKt.to(2131309790, 2131856362), TuplesKt.to(2131309791, 2131856382), TuplesKt.to(2131309792, 2131856372), TuplesKt.to(2131309793, 2131856358), TuplesKt.to(2131309794, 2131856374), TuplesKt.to(2131309796, 2131856369), TuplesKt.to(2131309797, 2131856370), TuplesKt.to(2131309798, 2131856375)});

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public final Rect getContainerUnavailableRect() {
        return new Rect();
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public final String getMiniPlayerContainerKey() {
        return "ogv_feedback_page";
    }

    @Override // com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment
    public final void nf() {
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.f67557n = arguments != null ? arguments.getString("season_title") : null;
            Bundle arguments2 = getArguments();
            String string = null;
            if (arguments2 != null) {
                string = arguments2.getString("season_id");
            }
            this.f67558o = string;
        }
    }

    @Override // com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment
    public final int of() {
        return -1;
    }

    @Override // com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment
    @NotNull
    public final ConstraintRadioGroup pf(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
        return (ConstraintRadioGroup) layoutInflater.inflate(2131493297, viewGroup, false);
    }

    @Override // com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment
    @NotNull
    public final String qf() {
        StringBuilder sb = new StringBuilder(getString(2131856376));
        String str = this.f67557n;
        if (str != null && str.length() != 0) {
            sb.append(getString(2131856365, this.f67557n));
        }
        String str2 = this.f67558o;
        if (str2 != null && str2.length() != 0) {
            sb.append(getString(2131856364, this.f67558o));
        }
        int i7 = this.f67588k;
        if (i7 > -1) {
            sb.append(getString(this.f67560q.get(Integer.valueOf(i7)).intValue()));
        }
        String string = StringsKt.trim(this.f67582d.getText().toString()).toString();
        if (string.length() > 0) {
            sb.append(getString(2131856383));
            sb.append(string);
        }
        return sb.toString();
    }

    @Override // com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment
    public final int rf() {
        return this.f67559p;
    }

    @Override // com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment
    public final boolean sf(int i7) {
        return ArraysKt.contains(new int[]{2131309793, 2131309796, 2131309797, 2131309798}, i7);
    }
}
