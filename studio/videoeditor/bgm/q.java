package com.bilibili.studio.videoeditor.bgm;

import android.app.Application;
import com.bilibili.lib.foundation.Foundation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/q.class */
public final class q {
    public static String a(int i7) {
        Application app2 = Foundation.Companion.instance().getApp();
        if (i7 == 72010081) {
            return app2.getString(2131849480);
        }
        switch (i7) {
            case 7201006:
                return app2.getString(2131849945);
            case 7201007:
                return app2.getString(2131850237);
            case 7201008:
                return app2.getString(2131850328);
            default:
                switch (i7) {
                    case 72010020:
                        return app2.getString(2131850122);
                    case 72010021:
                        return app2.getString(2131850535);
                    case 72010022:
                        return app2.getString(2131850109);
                    case 72010023:
                        return app2.getString(2131849158);
                    case 72010024:
                        return app2.getString(2131849032);
                    default:
                        switch (i7) {
                            case 72010026:
                                return app2.getString(2131850499);
                            case 72010027:
                                return app2.getString(2131849973);
                            default:
                                return app2.getString(2131849984);
                        }
                }
        }
    }
}
