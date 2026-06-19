package com.bilibili.ship.theseus.ugc.intro;

import android.net.Uri;
import com.bilibili.app.comm.list.common.utils.UriSafeKt;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.charge.ChargeRepository;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ChargingPlusOperationAction;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import mv0.C8043a;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/y.class */
public final class y implements com.bilibili.ship.theseus.united.page.restrictionlayer.t<ChargingPlusOperationAction> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeRepository f97914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C8043a f97915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PageAdRepository f97916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.view.a f97917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.view.d f97918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bilibili.ship.theseus.keel.player.h f97919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IPlayerCoreService f97920g;
    public final com.bilibili.ship.theseus.united.page.screenstate.c h;

    public y(ChargeRepository chargeRepository, C8043a c8043a, PageAdRepository pageAdRepository, com.bilibili.ship.theseus.united.page.view.a aVar, com.bilibili.ship.theseus.united.page.view.d dVar, com.bilibili.ship.theseus.keel.player.h hVar, IPlayerCoreService iPlayerCoreService, com.bilibili.ship.theseus.united.page.screenstate.c cVar) {
        this.f97914a = chargeRepository;
        this.f97915b = c8043a;
        this.f97916c = pageAdRepository;
        this.f97917d = aVar;
        this.f97918e = dVar;
        this.f97919f = hVar;
        this.f97920g = iPlayerCoreService;
        this.h = cVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final void a(ChargingPlusOperationAction chargingPlusOperationAction) {
        String str;
        ChargingPlusOperationAction chargingPlusOperationAction2 = chargingPlusOperationAction;
        ChargingPlusOperationAction.TYPE type = chargingPlusOperationAction2.f102518c;
        ChargingPlusOperationAction.TYPE type2 = ChargingPlusOperationAction.TYPE.CHARGING_PLUS_AD;
        ChargeRepository chargeRepository = this.f97914a;
        String str2 = chargingPlusOperationAction2.f102517b;
        if (type == type2 && Intrinsics.areEqual(str2, "manual")) {
            chargeRepository.c();
            return;
        }
        String str3 = chargingPlusOperationAction2.f102516a;
        if (str3.length() == 0) {
            return;
        }
        Uri uri = Uri.parse(str3);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        int length = UriSafeKt.safetyQueryParameterOrEmpty(uri, "spmid").length();
        C8043a c8043a = this.f97915b;
        if (length == 0) {
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, "spmid", c8043a.a().f123880b);
        }
        if (UriSafeKt.safetyQueryParameterOrEmpty(uri, "from_spmid").length() == 0) {
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, "from_spmid", c8043a.a().f123881c);
        }
        if (UriSafeKt.safetyQueryParameterOrEmpty(uri, "track_id").length() == 0) {
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, "track_id", c8043a.a().f123882d);
        }
        if (UriSafeKt.safetyQueryParameterOrEmpty(uri, "ad_track_id").length() == 0) {
            String str4 = this.f97916c.f98946j;
            String str5 = str4;
            if (str4 == null) {
                str5 = "";
            }
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, "ad_track_id", str5);
        }
        if (UriSafeKt.safetyQueryParameterOrEmpty(uri, GameCardButton.extraAvid).length() == 0) {
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, GameCardButton.extraAvid, this.f97917d.b());
        }
        if (UriSafeKt.safetyQueryParameterOrEmpty(uri, "up_mid").length() == 0) {
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, "up_mid", String.valueOf(this.f97918e.f()));
        }
        int length2 = UriSafeKt.safetyQueryParameterOrEmpty(uri, "player_progress").length();
        com.bilibili.ship.theseus.keel.player.h hVar = this.f97919f;
        if (length2 == 0) {
            com.bilibili.ship.theseus.keel.player.j jVarJ = hVar.j();
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, "player_progress", String.valueOf(jVarJ != null ? Duration.getInWholeSeconds-impl(jVarJ.F()) : 0L));
        }
        if (UriSafeKt.safetyQueryParameterOrEmpty(uri, "show_res").length() == 0) {
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, "show_res", str2);
        }
        if (UriSafeKt.safetyQueryParameterOrEmpty(uri, "try_over").length() == 0) {
            if (hVar.f91107a.k() == PlayerAvailability.FORBIDDEN) {
                MediaResource mediaResource = this.f97920g.getMediaResource();
                str = (mediaResource == null || !mediaResource.isPlayable()) ? "2" : "1";
            } else {
                str = "0";
            }
            UriSafeKt.safetyAppendQueryParameter(builderBuildUpon, "try_over", str);
        }
        this.h.g();
        if (!BiliAccounts.get(FoundationAlias.getFapp()).isLogin()) {
            com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
            return;
        }
        String string = builderBuildUpon.build().toString();
        chargeRepository.getClass();
        chargeRepository.f99151d.tryEmit(new Pair(string, chargingPlusOperationAction2.f102518c));
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final Class<ChargingPlusOperationAction> b() {
        return ChargingPlusOperationAction.class;
    }
}
