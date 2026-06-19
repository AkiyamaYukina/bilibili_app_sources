package com.bilibili.lib.tf.freedata.util.log;

import com.bilibili.lib.tf.LogLevel;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/freedata/util/log/TfLog.class */
public final class TfLog {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final boolean debug = false;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/freedata/util/log/TfLog$Companion.class */
    public static final class Companion {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/freedata/util/log/TfLog$Companion$WhenMappings.class */
        public static final /* synthetic */ class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LogLevel.values().length];
                try {
                    iArr[LogLevel.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[LogLevel.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[LogLevel.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[LogLevel.WARNING.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr[LogLevel.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError e11) {
                }
                try {
                    iArr[LogLevel.UNRECOGNIZED.ordinal()] = 6;
                } catch (NoSuchFieldError e12) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void d(@NotNull String str, @NotNull String str2) {
            if (TfLog.debug) {
                BLog.d(str, str2);
            } else {
                BLog.w(str, str2);
            }
        }

        public final void dfmt(@NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
            if (TfLog.debug) {
                BLog.dfmt(str, str2, Arrays.copyOf(objArr, objArr.length));
            } else {
                BLog.wfmt(str, str2, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final void e(@NotNull String str, @NotNull String str2) {
            BLog.e(str, str2);
        }

        public final void e(@NotNull String str, @NotNull String str2, @NotNull Throwable th) {
            BLog.e(str, str2, th);
        }

        public final void e(@NotNull String str, @NotNull Throwable th) {
            BLog.e(str, th);
        }

        public final void efmt(@NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
            BLog.efmt(str, str2, Arrays.copyOf(objArr, objArr.length));
        }

        public final void i(@NotNull String str, @NotNull String str2) {
            BLog.i(str, str2);
        }

        public final void ifmt(@NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
            BLog.ifmt(str, str2, Arrays.copyOf(objArr, objArr.length));
        }

        public final void log(int i7, @NotNull String str, @NotNull String str2) {
            int i8 = i7;
            if (!TfLog.debug) {
                i8 = i7;
                if (i7 < 4) {
                    i8 = 4;
                }
            }
            BLog.log(i8, str, str2);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final int logLevel(@NotNull LogLevel logLevel) throws NoWhenBranchMatchedException {
            int i7;
            switch (WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()]) {
                case 1:
                    i7 = 2;
                    break;
                case 2:
                    i7 = 3;
                    break;
                case 3:
                    i7 = 4;
                    break;
                case 4:
                    i7 = 5;
                    break;
                case 5:
                    i7 = 6;
                    break;
                case 6:
                    i7 = 8;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return i7;
        }

        public final void v(@NotNull String str, @NotNull String str2) {
            if (TfLog.debug) {
                BLog.v(str, str2);
            } else {
                BLog.i(str, str2);
            }
        }

        public final void vfmt(@NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
            if (TfLog.debug) {
                BLog.vfmt(str, str2, Arrays.copyOf(objArr, objArr.length));
            } else {
                BLog.ifmt(str, str2, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final void w(@NotNull String str, @NotNull String str2) {
            BLog.w(str, str2);
        }

        public final void wfmt(@NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
            BLog.wfmt(str, str2, Arrays.copyOf(objArr, objArr.length));
        }
    }
}
