package com.demo.tao.bean;

import java.io.Serializable;

/**
 * 
 * @ClassName: UnifiedPayUsePayResult
 * @Description: 统一支付返回结果集
 * @author dongyp
 * @date 2019年3月9日 下午2:36:23
 */
public class UnifiedPayUsePayResult implements Serializable
{

    /**
     * @Fields serialVersionUID : 序列化ID
     */
    private static final long serialVersionUID  = -8894423919823137890L;

    /**
     * 券号/套餐子编码
     */
    private String            code;

    /**
     * 券号/套餐编码
     */
    private String            darkCode;

    /**
     * 套餐卡 （明卡号）
     */
    private String            cardCode;

    /**
     * (支付名称) 卡券名称
     */
    private String            payName;

    /**
     * 本次支付金额或者本次优惠金额
     */
    private double            payMoney;

    /**
     * 余额、面额
     */
    private double            remainMoney;

    /**
     * 临时支付密钥
     */
    private String            payKey;

    /**
     * （券 的 Type 类型 如：折扣券，代金券） 套餐 的UseType
     */
    private String            useType;

    /**
     * 折扣率
     */
    private double            discount;

    /**
     * 当前使用的 卡/劵 标示为0 ； 可使用卡/劵 1
     */
    private int               currentUse        = 0;

    /**
     * 订单号
     */
    private String            kzPaySeq;

    /**
     * 套餐类型.1:特权;2:业务 3 账户余额 4.账户积分支付 5 券
     */
    private String            packageType;

    private String            fIntegrationMoney = "0";                  // 积分抵扣规则

    private String            fTotalIntegration;                        // 剩余积分；

    /**
     * 支付类型 见STATE 类 PAY
     */
    private String            payType;

    /**
     * 券适用类型 1.通用券 2.单品券 3.品牌券 4.品类券 5.运费
     */
    private String            fTicketType;
    /**
     * 券类型编码
     */
    private String            fTicketTypeId;
    /**
     * 券类型名称
     */
    private String            fTicketTypeName;

    /**
     * 券/套餐图片
     */
    private String            fImage;

    // 券适用范围,0不限，1商城， 2线下
    private Integer           fUseRange;
    // 有效期(开始时间)
    private String            fStartTime;
    // 有效期(结束时间)
    private String            fEndTime;
    // 0：不限 1：自定义 2：固定时长
    private String            fUsedTime;
    // 最低消费
    private Long              fLowMoney;
    // 按指定消费金额 0 按整单消费金额 1
    private Integer           fIsSpecifySales;
    // 有效天数
    private Integer           fDays;

    public String getfImage()
    {
        return fImage;
    }

    public void setfImage(String fImage)
    {
        this.fImage = fImage;
    }

    public String getfTicketTypeId()
    {
        return fTicketTypeId;
    }

    public void setfTicketTypeId(String fTicketTypeId)
    {
        this.fTicketTypeId = fTicketTypeId;
    }

    /**
     * 
     * @Title: getCode @Description: 获取 券号/套餐子编码 @return @return String
     * 返回类型 @throws
     */
    public String getCode()
    {
        return code;
    }

    /**
     * 
     * @Title: setCode @Description: 设置 券号/套餐子编码 @param code @return void
     * 返回类型 @throws
     */
    public void setCode(String code)
    {
        this.code = code;
    }

    /**
     * 
     * @Title: getCardCode @Description: 获取 套餐卡 （明卡号） @return @return String
     * 返回类型 @throws
     */
    public String getCardCode()
    {
        return cardCode;
    }

    /**
     * 
     * @Title: setCardCode @Description: 设置 套餐卡 （明卡号） @param cardCode @return
     * void 返回类型 @throws
     */
    public void setCardCode(String cardCode)
    {
        this.cardCode = cardCode;
    }

    /**
     * 
     * @Title: getPayName @Description: 获取 (支付名称) 卡券名称 @return @return String
     * 返回类型 @throws
     */
    public String getPayName()
    {
        return payName;
    }

    /**
     * 
     * @Title: setPayName @Description: 当前使用的 卡/劵 标示为0 ； 可使用卡/劵 1 @param
     * payName @return void 返回类型 @throws
     */
    public void setPayName(String payName)
    {
        this.payName = payName;
    }

    /**
     * 
     * @Title: getPayMoney @Description: 获取 本次支付金额或者本次优惠金额 @return @return
     * double 返回类型 @throws
     */
    public double getPayMoney()
    {
        return payMoney;
    }

    /**
     * 
     * @Title: setPayMoney @Description:设置 本次支付金额或者本次优惠金额 @param
     * payMoney @return void 返回类型 @throws
     */
    public void setPayMoney(double payMoney)
    {
        this.payMoney = payMoney;
    }

    /**
     * 
     * @Title: getRemainMoney @Description: 获取 余额、面额 @return @return double
     * 返回类型 @throws
     */
    public double getRemainMoney()
    {
        return remainMoney;
    }

    /**
     * 
     * @Title: setRemainMoney @Description: 设置 余额、面额 @param remainMoney @return
     * void 返回类型 @throws
     */
    public void setRemainMoney(double remainMoney)
    {
        this.remainMoney = remainMoney;
    }

    /**
     * 
     * @Title: getPayKey @Description: 获取 支付秘钥 @return @return String
     * 返回类型 @throws
     */
    public String getPayKey()
    {
        return payKey;
    }

    /**
     * 
     * @Title: setPayKey @Description: 设置 支付秘钥 @param payKey @return void
     * 返回类型 @throws
     */
    public void setPayKey(String payKey)
    {
        this.payKey = payKey;
    }

    /**
     * 
     * @Title: setUseType @Description: 设置 （券 的 Type 类型 如：折扣券，代金券） 套餐
     * 的UseType @return 适用类型 0.通用券 1.单品券 2.品牌券 3.品类券 4.运费 @return String
     * 返回类型 @throws
     */
    public String getUseType()
    {
        return useType;
    }

    /**
     * 
     * @Title: setUseType @Description: 设置 （券 的 Type 类型 如：折扣券，代金券） 套餐
     * 的UseType @param useType @return void 返回类型 @throws
     */
    public void setUseType(String useType)
    {
        this.useType = useType;
    }

    /**
     * 
     * @Title: getDiscount @Description:获取 折扣率 @return @return double
     * 返回类型 @throws
     */
    public double getDiscount()
    {
        return discount;
    }

    /**
     * 
     * @Title: setDiscount @Description: 设置 折扣率 @param discount @return void
     * 返回类型 @throws
     */
    public void setDiscount(double discount)
    {
        this.discount = discount;
    }

    /**
     * 
     * @Title: getCurrentUse @Description: 获取 当前使用的 卡/劵 标示为0 ； 可使用卡/劵
     * 1 @return @return int 返回类型 @throws
     */
    public int getCurrentUse()
    {
        return currentUse;
    }

    /**
     * 
     * @Title: setCurrentUse @Description: 设置 当前使用的 卡/劵 标示为0 ； 可使用卡/劵 1 @param
     * currentUse @return void 返回类型 @throws
     */
    public void setCurrentUse(int currentUse)
    {
        this.currentUse = currentUse;
    }

    /**
     * 
     * @Title: getKzPaySeq @Description: 获取 客至订单号 @return @return String
     * 返回类型 @throws
     */
    public String getKzPaySeq()
    {
        return kzPaySeq;
    }

    /**
     * 
     * @Title: setKzPaySeq @Description: 设置 客至订单号 @param kzPaySeq @return void
     * 返回类型 @throws
     */
    public void setKzPaySeq(String kzPaySeq)
    {
        this.kzPaySeq = kzPaySeq;
    }

    /**
     * 
     * @Title: getDarkCode @Description: 获取 券号/套餐编码 @return @return String
     * 返回类型 @throws
     */
    public String getDarkCode()
    {
        return darkCode;
    }

    /**
     * 
     * @Title: setDarkCode @Description: 设置 券号/套餐编码 @param darkCode @return void
     * 返回类型 @throws
     */
    public void setDarkCode(String darkCode)
    {
        this.darkCode = darkCode;
    }

    /**
     * 
     * @Title: getPackageType @Description: 获取 套餐类型.1:特权;2:业务 3 账户余额 4.账户积分支付 5
     * 券 @return @return String 返回类型 @throws
     */
    public String getPackageType()
    {
        return packageType;
    }

    /**
     * 
     * @Title: setPackageType @Description: 设置 套餐类型.1:特权;2:业务 3 账户余额 4.账户积分支付 5
     * 券 @param packageType @return void 返回类型 @throws
     */
    public void setPackageType(String packageType)
    {
        this.packageType = packageType;
    }

    /**
     * 
     * @Title: getPayType @Description: 获取 支付类型 见STATE 类 PAY @return @return
     * String 返回类型 @throws
     */
    public String getPayType()
    {
        return payType;
    }

    /**
     * 
     * @Title: setPayType @Description: 设置 支付类型 见STATE 类 PAY @param
     * payType @return void 返回类型 @throws
     */
    public void setPayType(String payType)
    {
        this.payType = payType;
    }

    public String getfIntegrationMoney()
    {
        return fIntegrationMoney;
    }

    public void setfIntegrationMoney(String fIntegrationMoney)
    {
        this.fIntegrationMoney = fIntegrationMoney;
    }

    public String getfTotalIntegration()
    {
        return fTotalIntegration;
    }

    public void setfTotalIntegration(String fTotalIntegration)
    {
        this.fTotalIntegration = fTotalIntegration;
    }

    public String getfTicketType()
    {
        return fTicketType;
    }

    public void setfTicketType(String fTicketType)
    {
        this.fTicketType = fTicketType;
    }

    public String getfTicketTypeName()
    {
        return fTicketTypeName;
    }

    public void setfTicketTypeName(String fTicketTypeName)
    {
        this.fTicketTypeName = fTicketTypeName;
    }

    public Integer getfUseRange()
    {
        return fUseRange;
    }

    public void setfUseRange(Integer fUseRange)
    {
        this.fUseRange = fUseRange;
    }

    public String getfStartTime()
    {
        return fStartTime;
    }

    public void setfStartTime(String fStartTime)
    {
        this.fStartTime = fStartTime;
    }

    public String getfEndTime()
    {
        return fEndTime;
    }

    public void setfEndTime(String fEndTime)
    {
        this.fEndTime = fEndTime;
    }

    public String getfUsedTime()
    {
        return fUsedTime;
    }

    public void setfUsedTime(String fUsedTime)
    {
        this.fUsedTime = fUsedTime;
    }

    public Long getfLowMoney()
    {
        return fLowMoney;
    }

    public void setfLowMoney(Long fLowMoney)
    {
        this.fLowMoney = fLowMoney;
    }

    public Integer getfIsSpecifySales()
    {
        return fIsSpecifySales;
    }

    public void setfIsSpecifySales(Integer fIsSpecifySales)
    {
        this.fIsSpecifySales = fIsSpecifySales;
    }

    public Integer getfDays()
    {
        return fDays;
    }

    public void setfDays(Integer fDays)
    {
        this.fDays = fDays;
    }

}
