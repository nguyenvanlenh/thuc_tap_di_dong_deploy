package com.example.api_web_ban_hang.models;


public class AddressRequest {
        private String address;
        private String ward_name;
        private String district_name;
        private String province_name;
        private String ward_id;
        private String district_id;
        private String province_id;

        public AddressRequest(String address, String ward_name, String district_name, String province_name, String ward_id, String district_id, String province_id) {
                this.address = address;
                this.ward_name = ward_name;
                this.district_name = district_name;
                this.province_name = province_name;
                this.ward_id = ward_id;
                this.district_id = district_id;
                this.province_id = province_id;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getWard_name() {
                return ward_name;
        }

        public void setWard_name(String ward_name) {
                this.ward_name = ward_name;
        }

        public String getDistrict_name() {
                return district_name;
        }

        public void setDistrict_name(String district_name) {
                this.district_name = district_name;
        }

        public String getProvince_name() {
                return province_name;
        }

        public void setProvince_name(String province_name) {
                this.province_name = province_name;
        }

        public String getWard_id() {
                return ward_id;
        }

        public void setWard_id(String ward_id) {
                this.ward_id = ward_id;
        }

        public String getDistrict_id() {
                return district_id;
        }

        public void setDistrict_id(String district_id) {
                this.district_id = district_id;
        }

        public String getProvince_id() {
                return province_id;
        }

        public void setProvince_id(String province_id) {
                this.province_id = province_id;
        }
}
