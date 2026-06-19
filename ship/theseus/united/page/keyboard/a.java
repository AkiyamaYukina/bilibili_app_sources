package com.bilibili.ship.theseus.united.page.keyboard;

import android.util.SparseArray;
import android.view.KeyboardShortcutGroup;
import android.view.KeyboardShortcutInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.studio.videoeditor.CaptionFx;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import javax.inject.Inject;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import yk.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/keyboard/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final SparseArray<Integer> f102006i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f102008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f102009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f102010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IPlayDirector f102011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f102012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Er0.a f102013g;

    @Nullable
    public final KeyboardShortcutGroup h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.keyboard.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/keyboard/a$a.class */
    public static final class C1068a {
        public static final void a(int i7) {
            SparseArray<Integer> sparseArray = a.f102006i;
            Neurons.reportClick(false, "player.player.peripheral-kb.hotkey.click", MapsKt.mapOf(TuplesKt.to("type", String.valueOf(a.f102006i.get(i7)))));
        }
    }

    static {
        SparseArray<Integer> sparseArray = new SparseArray<>();
        sparseArray.put(4, 1);
        sparseArray.put(CaptionFx.BUBBLEPATH_FIELD_NUMBER, 1);
        sparseArray.put(62, 2);
        sparseArray.put(22, 3);
        sparseArray.put(21, 4);
        sparseArray.put(34, 7);
        sparseArray.put(71, 8);
        sparseArray.put(72, 9);
        sparseArray.put(66, 10);
        f102006i = sparseArray;
    }

    @Inject
    public a(@NotNull CoroutineScope coroutineScope, @NotNull c cVar, @NotNull h hVar, @NotNull PlayerContainer playerContainer, @NotNull IPlayDirector iPlayDirector, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull Er0.a aVar) {
        this.f102007a = coroutineScope;
        this.f102008b = cVar;
        this.f102009c = hVar;
        this.f102010d = playerContainer;
        this.f102011e = iPlayDirector;
        this.f102012f = iPlayerSettingService;
        this.f102013g = aVar;
        KeyboardShortcutGroup keyboardShortcutGroup = new KeyboardShortcutGroup(LogReportStrategy.TAG_DEFAULT);
        this.h = keyboardShortcutGroup;
        KeyboardShortcutInfo keyboardShortcutInfo = new KeyboardShortcutInfo("退出全屏", CaptionFx.BUBBLEPATH_FIELD_NUMBER, 0);
        KeyboardShortcutInfo keyboardShortcutInfo2 = new KeyboardShortcutInfo("播放/暂停", 62, 0);
        KeyboardShortcutInfo keyboardShortcutInfo3 = new KeyboardShortcutInfo("步进5s", 22, 0);
        KeyboardShortcutInfo keyboardShortcutInfo4 = new KeyboardShortcutInfo("步退5s", 21, 0);
        KeyboardShortcutInfo keyboardShortcutInfo5 = new KeyboardShortcutInfo("音量增加10%", 19, 0);
        KeyboardShortcutInfo keyboardShortcutInfo6 = new KeyboardShortcutInfo("音量降低10%", 20, 0);
        KeyboardShortcutInfo keyboardShortcutInfo7 = new KeyboardShortcutInfo("全屏/退出全屏", 34, 0);
        KeyboardShortcutInfo keyboardShortcutInfo8 = new KeyboardShortcutInfo("上一集", 71, 0);
        KeyboardShortcutInfo keyboardShortcutInfo9 = new KeyboardShortcutInfo("下一集", 72, 0);
        KeyboardShortcutInfo keyboardShortcutInfo10 = new KeyboardShortcutInfo("发弹幕", 66, 0);
        keyboardShortcutGroup.addItem(keyboardShortcutInfo);
        keyboardShortcutGroup.addItem(keyboardShortcutInfo2);
        keyboardShortcutGroup.addItem(keyboardShortcutInfo3);
        keyboardShortcutGroup.addItem(keyboardShortcutInfo4);
        keyboardShortcutGroup.addItem(keyboardShortcutInfo5);
        keyboardShortcutGroup.addItem(keyboardShortcutInfo6);
        keyboardShortcutGroup.addItem(keyboardShortcutInfo7);
        keyboardShortcutGroup.addItem(keyboardShortcutInfo8);
        keyboardShortcutGroup.addItem(keyboardShortcutInfo9);
        keyboardShortcutGroup.addItem(keyboardShortcutInfo10);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TheseusKeyboardShortcutService$2(this, null), 3, (Object) null);
    }

    public final boolean a(int i7, @NotNull BaseAppCompatActivity baseAppCompatActivity) {
        if (i7 != 4) {
            if (i7 == 34) {
                c cVar = this.f102008b;
                if (!cVar.h().f102988b) {
                    cVar.e();
                    C1068a.a(i7);
                    return true;
                }
                if (cVar.h().f102988b) {
                    cVar.g();
                    C1068a.a(i7);
                    return true;
                }
                baseAppCompatActivity.onBackPressed();
                C1068a.a(i7);
                return true;
            }
            h hVar = this.f102009c;
            if (i7 == 62) {
                if (hVar.f91107a.a()) {
                    BLog.i("TheseusKeyboardShortcutService-onKeyDown", "[theseus-united-TheseusKeyboardShortcutService-onKeyDown] key down call player pause");
                    hVar.pause();
                } else {
                    hVar.p();
                }
                C1068a.a(i7);
                return true;
            }
            if (i7 == 66) {
                C1068a.a(i7);
                return false;
            }
            if (i7 != 111) {
                if (i7 == 21) {
                    j jVarJ = hVar.j();
                    if (jVarJ == null || hVar.f91107a.k() != PlayerAvailability.READY) {
                        return true;
                    }
                    BuildersKt.launch$default(this.f102007a, (CoroutineContext) null, (CoroutineStart) null, new TheseusKeyboardShortcutService$onKeyDown$2(jVarJ, null), 3, (Object) null);
                    C1068a.a(i7);
                    return true;
                }
                if (i7 == 22) {
                    j jVarJ2 = hVar.j();
                    if (jVarJ2 == null || hVar.f91107a.k() != PlayerAvailability.READY) {
                        return true;
                    }
                    BuildersKt.launch$default(this.f102007a, (CoroutineContext) null, (CoroutineStart) null, new TheseusKeyboardShortcutService$onKeyDown$1(jVarJ2, null), 3, (Object) null);
                    C1068a.a(i7);
                    return true;
                }
                c.a aVar = c.a.a;
                Er0.a aVar2 = this.f102013g;
                IPlayerSettingService iPlayerSettingService = this.f102012f;
                IPlayDirector iPlayDirector = this.f102011e;
                if (i7 == 71) {
                    int i8 = iPlayerSettingService.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
                    yk.c cVar2 = (yk.c) aVar2.get(aVar);
                    if (cVar2 != null && cVar2.i0()) {
                        if (iPlayDirector.hasPrevious(i8 == 4)) {
                            yk.c cVar3 = (yk.c) aVar2.get(aVar);
                            if (cVar3 != null) {
                                cVar3.g();
                            }
                            C1068a.a(i7);
                            return true;
                        }
                    }
                    boolean zH = iPlayerSettingService.getCloudConfig().H(false);
                    boolean z6 = iPlayDirector.itemCount() > 1;
                    if (!zH || !z6) {
                        return true;
                    }
                    boolean z7 = false;
                    if (i8 == 4) {
                        z7 = true;
                    }
                    iPlayDirector.switchToPrevious(z7);
                    C1068a.a(i7);
                    return true;
                }
                if (i7 != 72) {
                    return false;
                }
                int i9 = iPlayerSettingService.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
                yk.c cVar4 = (yk.c) aVar2.get(aVar);
                if (cVar4 != null && cVar4.i0()) {
                    if (iPlayDirector.hasNext(i9 == 4)) {
                        yk.c cVar5 = (yk.c) aVar2.get(aVar);
                        if (cVar5 != null) {
                            cVar5.h();
                        }
                        C1068a.a(i7);
                        return true;
                    }
                }
                boolean zH2 = iPlayerSettingService.getCloudConfig().H(false);
                boolean z8 = iPlayDirector.itemCount() > 1;
                if (!zH2 || !z8) {
                    return true;
                }
                boolean z9 = false;
                if (i9 == 4) {
                    z9 = true;
                }
                iPlayDirector.switchToNext(z9);
                C1068a.a(i7);
                return true;
            }
        }
        baseAppCompatActivity.onBackPressed();
        C1068a.a(i7);
        return true;
    }
}
