package com.bilibili.playset;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.supermenu.core.IMenu;
import com.bilibili.app.comm.supermenu.core.IMenuItem;
import com.bilibili.app.comm.supermenu.core.MenuImpl;
import com.bilibili.app.comm.supermenu.core.MenuItemImpl;
import com.bilibili.app.comm.supermenu.share.v2.MenuItemHandler;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import com.bilibili.playset.api.MultitypeMedia;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import tv.danmaku.bili.downloadeshare.DownloadShare;
import tv.danmaku.bili.downloadeshare.DownloadShareParameter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/M0.class */
public final class M0 extends MenuItemHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f83890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<MenuItemImpl> f83891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1<String, Boolean> f83892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MultitypeMedia f83893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H0 f83894e;

    /* JADX WARN: Multi-variable type inference failed */
    public M0(FragmentActivity fragmentActivity, List<MenuItemImpl> list, Function1<? super String, Boolean> function1, MultitypeMedia multitypeMedia, H0 h02) {
        this.f83890a = fragmentActivity;
        this.f83891b = list;
        this.f83892c = function1;
        this.f83893d = multitypeMedia;
        this.f83894e = h02;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean handleClick(IMenuItem iMenuItem) {
        String itemId = iMenuItem.getItemId();
        if (itemId == null) {
            return false;
        }
        int iHashCode = itemId.hashCode();
        MultitypeMedia multitypeMedia = this.f83893d;
        H0 h02 = this.f83894e;
        switch (iHashCode) {
            case -2047011218:
                if (!itemId.equals("menu_translate")) {
                    return false;
                }
                break;
            case -80435792:
                if (!itemId.equals("delete_favorite")) {
                    return false;
                }
                break;
            case -15705638:
                if (!itemId.equals(SocializeMedia.MENU_ID_SYS_DOWNLOAD)) {
                    return false;
                }
                DownloadShare downloadShareWith = DownloadShare.Companion.with();
                DownloadShareParameter.Builder builder = new DownloadShareParameter.Builder();
                builder.setAvid(multitypeMedia.getAvId()).setCid(multitypeMedia.getShareSid()).setSpmid(h02.f83873d).setShareId(h02.f83870a).setShareOrigin(h02.f83871b);
                DownloadShare.startDownloadShare$default(downloadShareWith, this.f83890a, builder.build(), 0, 4, (Object) null);
                return true;
            case 79210:
                if (!itemId.equals(SocializeMedia.PIC)) {
                    return false;
                }
                H0.a(this.f83890a, h02, multitypeMedia);
                return true;
            default:
                return false;
        }
        return ((Boolean) this.f83892c.invoke(itemId)).booleanValue();
    }

    public final void onMenuList(List<IMenu> list) {
        super.onMenuList(list);
        if (TypeIntrinsics.isMutableList(list)) {
            MenuImpl menuImpl = new MenuImpl(this.f83890a);
            Iterator<T> it = this.f83891b.iterator();
            while (it.hasNext()) {
                menuImpl.addMenuItem((MenuItemImpl) it.next());
            }
            list.add(menuImpl);
        }
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
