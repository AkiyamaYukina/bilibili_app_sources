package com.bilibili.lib.projection.internal.device;

import com.bilibili.lib.projection.datasource.ProjectionDataSource;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import ie0.C7564c;
import ie0.InterfaceC7569h;
import io.reactivex.rxjava3.core.Observable;
import ke0.InterfaceC7753a;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/a.class */
public interface a extends InterfaceC7753a<Object> {

    /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.device.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/a$a.class */
    public static final class C0346a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0346a f63071a = new Object();

        @Override // com.bilibili.lib.projection.internal.device.a
        public final void A(long j7, int i7, int i8, boolean z6) {
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        public final void a() {
        }

        @Override // com.bilibili.lib.projection.internal.device.a, ke0.InterfaceC7753a
        public final void b(@NotNull Object obj) {
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        public final void c(boolean z6) {
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        public final void d() {
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        public final void e(int i7, @NotNull ProjectionDataSource projectionDataSource) {
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        public final void f(@Nullable a aVar) {
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        @Nullable
        public final InterfaceC7845m getClient() {
            return null;
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        @Nullable
        public final IProjectionPlayableItem getCurrentItem() {
            return null;
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        @NotNull
        public final ProjectionDeviceInternal getDevice() {
            return ProjectionDeviceInternal.b.f63069a;
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        public final int getIndex() {
            return -1;
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        public final long getProgress() {
            return 0L;
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        @NotNull
        public final InterfaceC7569h getService() {
            return C7564c.f121625a;
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        @Nullable
        public final ProjectionDataSource getSource() {
            return null;
        }

        @Override // ke0.InterfaceC7753a
        public final void i(@NotNull Object obj) {
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        @NotNull
        public final Observable<IProjectionPlayableItem> n() {
            return Observable.empty();
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        public final int p() {
            return -1;
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        public final void replay() {
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        public final void seekTo(long j7, int i7) {
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        public final void switchQuality(int i7) {
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        public final int t() {
            return -1;
        }

        @Override // com.bilibili.lib.projection.internal.device.a
        public final void x(@Nullable IProjectionPlayableItem iProjectionPlayableItem) {
        }
    }

    void A(long j7, int i7, int i8, boolean z6);

    void a();

    @Override // ke0.InterfaceC7753a
    void b(@NotNull Object obj);

    void c(boolean z6);

    void d();

    void e(int i7, @NotNull ProjectionDataSource projectionDataSource);

    void f(@Nullable a aVar);

    @Nullable
    InterfaceC7845m getClient();

    @Nullable
    IProjectionPlayableItem getCurrentItem();

    @NotNull
    ProjectionDeviceInternal getDevice();

    int getIndex();

    long getProgress();

    @NotNull
    InterfaceC7569h getService();

    @Nullable
    ProjectionDataSource getSource();

    @NotNull
    Observable<IProjectionPlayableItem> n();

    int p();

    void replay();

    void seekTo(long j7, int i7);

    void switchQuality(int i7);

    int t();

    void x(@Nullable IProjectionPlayableItem iProjectionPlayableItem);
}
