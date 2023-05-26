import packe3.MyService;
import packe3.impl.XiaoLu;
import packe3.impl.ZhuHaoWen;

module myOne {
    exports packe1;

    exports packe3;

   // provides MyService with ZhuHaoWen;
    provides MyService with XiaoLu;

}