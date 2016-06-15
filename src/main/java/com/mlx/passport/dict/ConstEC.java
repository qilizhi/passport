package com.mlx.passport.dict;

import java.util.ArrayList;
import java.util.List;

/**
 * 常量类
 * @author feihangchen
 *
 */
public class ConstEC {

	public static final String METHODTYPE = "methodType";
	public static final String GOODS = "goods";
	public static final String DEFAULT_PAGESIZE = "10";
	public static final String DEFAULT_PAGENO = "1";
	public static final String ORDER_INFO_SEQUENCE = "order_info_sequence";
	public static final String ORDER_JN_SEQUENCE = "order_jn_sequence";
	public static final String ORDER_REFUND_SEQUENCE = "order_refund_sequence";
	public static final String ORDER_REQUEST_SEQUENCE = "order_request_sequence";
	public static final String ENCODE_UTF8 = "utf-8";
	public static final String ENCODE_GBK = "gbk";
	// 所有定时器的状态 ,key:约束为定时器Bean的名字
	public static final List<String> SCHEDULER_STATUS = new ArrayList<String>();
	
	static {
		SCHEDULER_STATUS.add("orderRefundScheduler");
		SCHEDULER_STATUS.add("orderFindScheduler");
		SCHEDULER_STATUS.add("backGoodsStockScheduler");
	}

	public static final String MIMETYPE = "text/plain";

	public static final String SUCCESS = "success";
	public static final String CODE_0000 = "0000";
	public static final String CODE_200 = "200";

	public static final String VERSION = "1.0";
	public static final String SIGN = "sign";
	public static final String CURRENCY = "";
	public static final String RPID = "rpId";
	public static final String PARAMTER_VERIFY_PREFIX = "paramter_verify.";
	public static final String MLX_PRIVATEKEY = "mlx.privatekey";
}
