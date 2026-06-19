package com.bilibili.live.streaming.filter;

import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.gl.BGLException;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/filter/FilterBase.class */
public abstract class FilterBase implements IVideoSource {
    protected AVContext mCtx;
    protected String mName;

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public IVideoSource findInnerFilter(String str) {
        String str2 = this.mName;
        if (str2 == null || !str2.equals(str)) {
            return null;
        }
        return this;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public String getName() {
        String str = this.mName;
        String str2 = str;
        if (str == null) {
            str2 = "(anonymous)";
        }
        return str2;
    }

    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00c7: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r15 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:29:0x00c0 */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x00c3: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r16 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:29:0x00c0 */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x00c0: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r17 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:29:0x00c0 */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x00d7: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r18 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:31:0x00d0 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x00d0: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r19 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:31:0x00d0 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.nio.ByteBuffer getPixels() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.filter.FilterBase.getPixels():java.nio.ByteBuffer");
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void init(AVContext aVContext) {
        this.mCtx = aVContext;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void loadConfig(JSONObject jSONObject) {
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int preferFitMode() {
        return 2;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() throws BGLException {
        return render(-1);
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public boolean render(int i7) throws BGLException {
        return render();
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public JSONObject saveConfig() {
        return new JSONObject();
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void setName(String str) {
        this.mName = str;
    }

    public String toSourceString() {
        return getID() + "-" + this.mName + ":" + getHeight() + "x" + getHeight();
    }
}
