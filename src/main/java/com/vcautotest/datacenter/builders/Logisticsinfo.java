package com.vcautotest.datacenter.builders;

public class Logisticsinfo {

    private String regionCode;
    private String email;
    private String addr;
    private String tel;
    private String receiver;

    public static class LogisticsInfoBuilder{
        private String regionCode;
        private String email;
        private String addr;
        private String tel;
        private String receiver;

        public LogisticsInfoBuilder(String receiver){
            this.receiver = receiver;
        }

        public LogisticsInfoBuilder withEmail(String email){
            this.email = email;
            return this;
        }

        public LogisticsInfoBuilder withRegionCode(String regionCode){
            this.regionCode = regionCode;
            return this;
        }

        public LogisticsInfoBuilder withAddr(String addr){
            this.addr = addr;
            return this;
        }

        public LogisticsInfoBuilder withTel(String tel){
            this.tel = tel;
            return this;
        }

        public Logisticsinfo build(){
            Logisticsinfo logisticsinfo = new Logisticsinfo();
            logisticsinfo.regionCode = this.regionCode;
            logisticsinfo.email = this.email;
            logisticsinfo.addr = this.addr;
            logisticsinfo.tel = this.addr;
            logisticsinfo.receiver = this.receiver;

            return logisticsinfo;
        }
    }

    private Logisticsinfo(){

    }


}
