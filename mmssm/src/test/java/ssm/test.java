package ssm;

import com.alibaba.druid.util.StringUtils;
import org.junit.Test;
import ssm.utils.MD5Util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class test {
    @Test
    public void testMD5(){
        String mi = MD5Util.getMD5("000000");

        Map<String,Object> h = new HashMap<>();
        h.put("nihao","1.70000");
        h.put("hh","8");
        BigDecimal a  = new BigDecimal((String) h.get("nihao")).setScale(2, RoundingMode.HALF_UP);
        String aa =(String) h.get("hh");
        BigDecimal b  = new BigDecimal(StringUtils.isEmpty((String) h.get("hh"))?"0":((String)h.get("hh"))).setScale(2, RoundingMode.HALF_UP);
        String ss = a.toString();
        System.out.println(b.toString());
        System.out.println(ss);
        System.out.println(mi);
    }
}
