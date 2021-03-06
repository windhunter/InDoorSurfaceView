package com.karonl.surfaceinstance.Unit;

import android.util.JsonToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * Created by karonl on 16/4/12.
 */
public class DataJson {

    String json = "{\"_id\":\"570cf77757a46030037d4c30\",\"areas\":[{\"name\":\"耐克\",\"area\":[{\"x\":86.1,\"y\":1439.1},{\"x\":400.1,\"y\":1435.1},{\"x\":410.1,\"y\":1387.1},{\"x\":421.1,\"y\":1337.1},{\"x\":375.1,\"y\":1338.1},{\"x\":375.1,\"y\":1260.1},{\"x\":187.1,\"y\":1262.1},{\"x\":191.1,\"y\":1328.1},{\"x\":86.1,\"y\":1329.1}]},{\"name\":\"潮宏基\",\"area\":[{\"x\":811.1,\"y\":1431.1},{\"x\":837.1,\"y\":1423.1},{\"x\":859.1,\"y\":1417.1},{\"x\":862.1,\"y\":1283.1},{\"x\":811.1,\"y\":1284.1},{\"x\":811.1,\"y\":1431.1}]},{\"name\":\"emu\",\"area\":[{\"x\":860.1,\"y\":1414.1},{\"x\":898.1,\"y\":1411.1},{\"x\":931.1,\"y\":1415.1},{\"x\":929.1,\"y\":1283.1},{\"x\":859.1,\"y\":1278.1}]},{\"name\":\"浪琴\",\"area\":[{\"x\":932.1,\"y\":1415.1},{\"x\":955.1,\"y\":1424.1},{\"x\":975.1,\"y\":1438.1},{\"x\":1004.1,\"y\":1412.1},{\"x\":993.1,\"y\":1398.1},{\"x\":993.1,\"y\":1349.1},{\"x\":987.1,\"y\":1350.1},{\"x\":988.1,\"y\":1339.1},{\"x\":932.1,\"y\":1335.1},{\"x\":932.1,\"y\":1412.1}]},{\"name\":\"Stradivarius\",\"area\":[{\"x\":798.1,\"y\":1906.1},{\"x\":798.1,\"y\":1773.1},{\"x\":824.1,\"y\":1750.1},{\"x\":861.1,\"y\":1756.1},{\"x\":883.1,\"y\":1753.1},{\"x\":910.1,\"y\":1746.1},{\"x\":991.1,\"y\":1829.1},{\"x\":927.1,\"y\":1903.1},{\"x\":799.1,\"y\":1906.1}]},{\"name\":\"CASIO\",\"area\":[{\"x\":965.1,\"y\":1762.1},{\"x\":985.1,\"y\":1743.1},{\"x\":1018.1,\"y\":1778.1},{\"x\":1002.1,\"y\":1799.1},{\"x\":966.1,\"y\":1763.1}]},{\"name\":\"广州友谊商店\",\"area\":[{\"x\":1267.1,\"y\":1985.1},{\"x\":1270.1,\"y\":1892.1},{\"x\":1280.1,\"y\":1872.1},{\"x\":1286.1,\"y\":1858.1},{\"x\":1290.1,\"y\":1839.1},{\"x\":1288.1,\"y\":1828.1},{\"x\":1293.1,\"y\":1812.1},{\"x\":1308.1,\"y\":1797.1},{\"x\":1315.1,\"y\":1771.1},{\"x\":1311.1,\"y\":1747.1},{\"x\":1316.1,\"y\":1730.1},{\"x\":1329.1,\"y\":1712.1},{\"x\":1329.1,\"y\":1698.1},{\"x\":1342.1,\"y\":1696.1},{\"x\":1348.1,\"y\":1692.1},{\"x\":1440.1,\"y\":1691.1},{\"x\":1442.1,\"y\":1810.1},{\"x\":1459.1,\"y\":1810.1},{\"x\":1459.1,\"y\":1766.1},{\"x\":1659.1,\"y\":1764.1},{\"x\":1662.1,\"y\":2094.1},{\"x\":1386.1,\"y\":2098.1},{\"x\":1357.1,\"y\":2068.1},{\"x\":1377.1,\"y\":2054.1},{\"x\":1378.1,\"y\":2034.1},{\"x\":1329.1,\"y\":2038.1},{\"x\":1296.1,\"y\":2003.1},{\"x\":1289.1,\"y\":2008.1},{\"x\":1267.1,\"y\":1986.1}]},{\"name\":\"ICBC\",\"area\":[{\"x\":1459.9,\"y\":1768.1},{\"x\":1456.9,\"y\":1653.1},{\"x\":1532.9,\"y\":1650.1},{\"x\":1529.9,\"y\":1671.1},{\"x\":1656.9,\"y\":1669.1},{\"x\":1657.9,\"y\":1766.1}]},{\"name\":\"苏宁电器\",\"area\":[{\"x\":1411.9,\"y\":1407.1},{\"x\":1660.9,\"y\":1404.1},{\"x\":1662.9,\"y\":925.0999999999999},{\"x\":1554.9,\"y\":923.0999999999999},{\"x\":1555.9,\"y\":941.0999999999999},{\"x\":1407.9,\"y\":1097.1},{\"x\":1411.9,\"y\":1405.1}]},{\"name\":\"星巴克\",\"area\":[{\"x\":1288.9,\"y\":973.0999999999999},{\"x\":1307.9,\"y\":954.0999999999999},{\"x\":1367.9,\"y\":947.0999999999999},{\"x\":1366.9,\"y\":858.0999999999999},{\"x\":1291.9,\"y\":858.0999999999999},{\"x\":1289.9,\"y\":970.0999999999999}]},{\"name\":\"GAP\",\"area\":[{\"x\":745.9,\"y\":1075.1},{\"x\":771.9,\"y\":1074.1},{\"x\":802.9,\"y\":1068.1},{\"x\":842.9,\"y\":1065.1},{\"x\":888.9,\"y\":1065.1},{\"x\":930.9,\"y\":1071.1},{\"x\":977.9,\"y\":1081.1},{\"x\":1002.9,\"y\":1085.1},{\"x\":1002.9,\"y\":872.0999999999999},{\"x\":810.9,\"y\":876.0999999999999},{\"x\":809.9,\"y\":927.0999999999999},{\"x\":761.9,\"y\":930.0999999999999},{\"x\":760.9,\"y\":966.0999999999999},{\"x\":742.9,\"y\":967.0999999999999},{\"x\":744.9,\"y\":1074.1}]},{\"name\":\"周大福\",\"area\":[{\"x\":1007.9,\"y\":1469.1},{\"x\":1016.9,\"y\":1479.1},{\"x\":1140.9,\"y\":1479.1},{\"x\":1140.9,\"y\":1436.1},{\"x\":1091.9,\"y\":1385.1},{\"x\":1009.9,\"y\":1468.1}]},{\"name\":\"歌莉娅\",\"area\":[{\"x\":516.1,\"y\":1996.1},{\"x\":519.1,\"y\":2008.1},{\"x\":687.1,\"y\":2153.1},{\"x\":686.1,\"y\":2004.1},{\"x\":604.1,\"y\":2000.1},{\"x\":600.1,\"y\":1925.1},{\"x\":513.1,\"y\":1997.1}]},{\"name\":\"TRENDIANO\",\"area\":[{\"x\":431.1,\"y\":1783.1},{\"x\":503.1,\"y\":1781.1},{\"x\":501.1,\"y\":1745.1},{\"x\":553.1,\"y\":1744.1},{\"x\":555.1,\"y\":1636.1},{\"x\":428.1,\"y\":1640.1},{\"x\":429.1,\"y\":1784.1}]},{\"name\":\"HM\",\"area\":[{\"x\":586.9,\"y\":1134.1},{\"x\":621.9,\"y\":1119.1},{\"x\":646.9,\"y\":1105.1},{\"x\":677.9,\"y\":1095.1},{\"x\":684.9,\"y\":1092.1},{\"x\":684.9,\"y\":859.1},{\"x\":389.9,\"y\":870.1},{\"x\":388.9,\"y\":908.1},{\"x\":405.9,\"y\":908.1},{\"x\":405.9,\"y\":980.1},{\"x\":448.9,\"y\":1023.1},{\"x\":434.9,\"y\":1037.1},{\"x\":483.9,\"y\":1091.1},{\"x\":545.9,\"y\":1091.1}]},{\"name\":\"EP\",\"area\":[{\"x\":608.9,\"y\":2293.1},{\"x\":724.9,\"y\":2288.1},{\"x\":725.9,\"y\":2208.1},{\"x\":780.9,\"y\":2204.1},{\"x\":781.9,\"y\":2194.1},{\"x\":669.9,\"y\":2191.1},{\"x\":604.9,\"y\":2139.1},{\"x\":608.9,\"y\":2293.1}]},{\"name\":\"PULLBEAR\",\"area\":[{\"x\":281.1,\"y\":1935.1},{\"x\":390.1,\"y\":1814.1},{\"x\":390.1,\"y\":1712.1},{\"x\":207.1,\"y\":1715.1},{\"x\":209.1,\"y\":1743.1},{\"x\":171.1,\"y\":1743.1},{\"x\":174.1,\"y\":1939.1},{\"x\":281.1,\"y\":1938.1}]},{\"name\":\"MOCO\",\"area\":[{\"x\":1185.1,\"y\":1772.1},{\"x\":1237.1,\"y\":1769.1},{\"x\":1237.1,\"y\":1672.1},{\"x\":1143.1,\"y\":1672.1},{\"x\":1145.1,\"y\":1757.1},{\"x\":1186.1,\"y\":1757.1}]}]}";
    JSONTokener jsonTokener = new JSONTokener(json);
    JSONArray array;
    public DataJson() {
        try {
            JSONObject jsonObject = (JSONObject) jsonTokener.nextValue();
            array = jsonObject.getJSONArray("areas");

        }catch (JSONException e){

        }
    }

    public int size(){
        return array.length();
    }

    public JSONObject getArray(int i){
        JSONObject json = null;
        try {
            json = (JSONObject)this.array.get(i);
        }catch (JSONException e){

        }
        return json;
    }
}

