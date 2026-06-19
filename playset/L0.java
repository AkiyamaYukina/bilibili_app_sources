package com.bilibili.playset;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.supermenu.core.IMenuItem;
import com.bilibili.app.comm.supermenu.share.v2.MenuItemHandler;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import com.bilibili.playset.api.MultitypeMedia;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.bili.downloadeshare.DownloadShare;
import tv.danmaku.bili.downloadeshare.DownloadShareParameter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/L0.class */
public final class L0 extends MenuItemHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1<String, Boolean> f83886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultitypeMedia f83887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H0 f83888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FragmentActivity f83889d;

    /* JADX WARN: Multi-variable type inference failed */
    public L0(Function1<? super String, Boolean> function1, MultitypeMedia multitypeMedia, H0 h02, FragmentActivity fragmentActivity) {
        this.f83886a = function1;
        this.f83887b = multitypeMedia;
        this.f83888c = h02;
        this.f83889d = fragmentActivity;
    }

    public final boolean handleClick(IMenuItem iMenuItem) {
        String itemId = iMenuItem.getItemId();
        if (itemId == null) {
            return false;
        }
        int iHashCode = itemId.hashCode();
        if (iHashCode == -80435792) {
            if (itemId.equals("delete_favorite")) {
                return ((Boolean) this.f83886a.invoke(itemId)).booleanValue();
            }
            return false;
        }
        MultitypeMedia multitypeMedia = this.f83887b;
        H0 h02 = this.f83888c;
        if (iHashCode != -15705638) {
            if (iHashCode != 79210 || !itemId.equals(SocializeMedia.PIC)) {
                return false;
            }
            H0.a(this.f83889d, h02, multitypeMedia);
            return true;
        }
        if (!itemId.equals(SocializeMedia.MENU_ID_SYS_DOWNLOAD)) {
            return false;
        }
        DownloadShare downloadShareWith = DownloadShare.Companion.with();
        DownloadShareParameter.Builder builder = new DownloadShareParameter.Builder();
        builder.setAvid(multitypeMedia.getAvId()).setCid(multitypeMedia.getShareSid()).setSpmid(h02.f83873d).setShareId(h02.f83870a).setShareOrigin(h02.f83871b);
        DownloadShare.startDownloadShare$default(downloadShareWith, this.f83889d, builder.build(), 0, 4, (Object) null);
        return true;
    }

    public final IMenuItem onPrepareShow(IMenuItem iMenuItem) {
        if (Intrinsics.areEqual(iMenuItem.getItemId(), SocializeMedia.MENU_ID_SYS_DOWNLOAD)) {
            iMenuItem.setShowNewTip(Boolean.FALSE);
        }
        return super.onPrepareShow(iMenuItem);
    }

    public final String[] registerActionMenuItems() {
        return new String[]{"delete_favorite", SocializeMedia.PIC, SocializeMedia.MENU_ID_SYS_DOWNLOAD};
    }
}
