package com.bilibili.search2.eastereggs;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.resmanager.ResManager;
import com.bilibili.lib.resmanager.ResRequest;
import com.bilibili.lib.resmanager.ResResponse;
import com.bilibili.lib.stagger.KeyType;
import java.io.File;
import mf0.C7993h;
import mf0.InterfaceC7988c;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/q.class */
@StabilityInferred(parameters = 0)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f86525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f86526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f86528d;

    public q(@Nullable String str, @Nullable String str2, boolean z6, boolean z7) {
        this.f86525a = str;
        this.f86526b = str2;
        this.f86527c = z6;
        this.f86528d = z7;
    }

    @Nullable
    public final File a() {
        String str;
        String str2 = this.f86525a;
        String str3 = this.f86526b;
        if (str3 != null) {
            str = str3;
        } else {
            if (str2 == null) {
                return null;
            }
            str = str2;
        }
        if (!this.f86527c) {
            return null;
        }
        if (!this.f86528d) {
            ResResponse resResponseFetch = ResManager.fetch(new ResRequest(str2, str3));
            File file = null;
            if (resResponseFetch != null) {
                file = resResponseFetch.getFile();
            }
            if (file == null) {
                com.bilibili.adcommon.utils.i.a("resource not exist ", str3, " ", str2, "SearchLocalDataManager");
            }
            return file;
        }
        InterfaceC7988c interfaceC7988cT0 = C7993h.f123760b.getResources().t0("egg", str, KeyType.HASH);
        if (interfaceC7988cT0 == null || !interfaceC7988cT0.a()) {
            com.bilibili.adcommon.utils.i.a("resource not exist in stagger ", str3, " ", str2, "SearchLocalDataManager");
            return null;
        }
        String path = interfaceC7988cT0.getPath();
        File file2 = null;
        if (path != null) {
            file2 = new File(path);
        }
        return file2;
    }
}
