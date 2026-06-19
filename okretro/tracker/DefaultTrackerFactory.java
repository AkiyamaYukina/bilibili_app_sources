package com.bilibili.okretro.tracker;

import com.bilibili.okretro.tracker.ApiTracker;
import okhttp3.Call;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/tracker/DefaultTrackerFactory.class */
public class DefaultTrackerFactory implements ApiTracker.Factory {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/tracker/DefaultTrackerFactory$a.class */
    public final class a implements ApiTracker {
        @Override // com.bilibili.okretro.tracker.ApiTracker
        public final void beginConnect(String str, String str2) {
        }

        @Override // com.bilibili.okretro.tracker.ApiTracker
        public final void beginParse() {
        }

        @Override // com.bilibili.okretro.tracker.ApiTracker
        public final void beginReadBody() {
        }

        @Override // com.bilibili.okretro.tracker.ApiTracker
        public final void endConnect(long j7, int i7, Throwable th) {
        }

        @Override // com.bilibili.okretro.tracker.ApiTracker
        public final void endParse(int i7, String str, Throwable th) {
        }

        @Override // com.bilibili.okretro.tracker.ApiTracker
        public final void endReadBody(byte[] bArr, Throwable th) {
        }

        @Override // com.bilibili.okretro.tracker.ApiTracker
        public final void finish() {
        }

        @Override // com.bilibili.okretro.tracker.ApiTracker
        public final void setCall(Call call) {
        }

        @Override // com.bilibili.okretro.tracker.ApiTracker
        public final void updateUrl(String str) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.okretro.tracker.ApiTracker, java.lang.Object] */
    @Override // com.bilibili.okretro.tracker.ApiTracker.Factory
    public ApiTracker getTracker() {
        return new Object();
    }
}
