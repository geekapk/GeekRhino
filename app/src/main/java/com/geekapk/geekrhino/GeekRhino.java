package com.geekapk.geekrhino;

/**
 * GeekRhino API For GeekApk Market
 * <p>
 * This class explodes an Interface for GeekApk Market to Execute GeekApk Extension Scripts
 * <p>
 * Any Activity May have an instance of GeekRhino and able to call a trigger/change settings using GeekRhino Object
 * <p>
 * geekRhino = new GeekRhino(this);
 * //...
 * geekRhino.trigger_onTextReplace(tv, text, uv, dv);
 *
 * @author duangsuse
 * @version 0
 * @since 0.1.0
 */

public class GeekRhino {
    public static int VERSION_MAJOR = 0;
    public static int VERSION_MINOR = 1;
    public static int VERSION_PATCH = 0;
    public static String VERSION = String.format("%s.%s.%s", VERSION_MAJOR, VERSION_MINOR, VERSION_PATCH);
}