
package com.mparticle.sdk.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeviceInfo {

    @JsonProperty("build_identifier")
    private String buildIdentifier;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("product")
    private String product;
    @JsonProperty("device")
    private String device;
    @JsonProperty("device_manufacturer")
    private String deviceManufacturer;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("os_version")
    private String osVersion;
    @JsonProperty("device_model")
    private String deviceModel;
    @JsonProperty("screen_height")
    private Integer screenHeight;
    @JsonProperty("screen_width")
    private Integer screenWidth;
    @JsonProperty("screen_dpi")
    private Integer screenDpi;
    @JsonProperty("is_tablet")
    private Boolean isTablet;
    @JsonProperty("device_country")
    private String deviceCountry;
    @JsonProperty("locale_country")
    private String localeCountry;
    @JsonProperty("locale_language")
    private String localeLanguage;
    @JsonProperty("network_country")
    private String networkCountry;
    @JsonProperty("network_carrier")
    private String networkCarrier;
    @JsonProperty("network_code")
    private String networkCode;
    @JsonProperty("network_mobile_country_code")
    private String networkMobileCountryCode;
    @JsonProperty("timezone_offset")
    private Integer timezoneOffset;
    @JsonProperty("android_uuid")
    private String androidUuid;
    @JsonProperty("ios_advertising_id")
    private String iosAdvertisingId;
    @JsonProperty("ios_idfv")
    private String iosIdfv;
    @JsonProperty("android_advertising_id")
    private String androidAdvertisingId;
    @JsonProperty("http_header_user_agent")
    private String httpHeaderUserAgent;
    @JsonProperty("push_token")
    private String pushToken;
    @JsonProperty("cpu_architecture")
    private String cpuArchitecture;
    @JsonProperty("push_notification_sound_enabled")
    private Boolean pushNotificationSoundEnabled;
    @JsonProperty("push_notification_vibrate_enabled")
    private Boolean pushNotificationVibrateEnabled;
    @JsonProperty("radio_access_technology")
    private String radioAccessTechnology;
    @JsonProperty("supports_telephony")
    private String supportsTelephony;
    @JsonProperty("has_nfc")
    private Boolean hasNfc;
    @JsonProperty("bluetooth_enabled")
    private Boolean bluetoothEnabled;
    @JsonProperty("bluetooth_version")
    private String bluetoothVersion;

    /**
     * @return The buildIdentifier
     */
    @JsonProperty("build_identifier")
    public String getBuildIdentifier() {
        return buildIdentifier;
    }

    /**
     * @param buildIdentifier The build_identifier
     */
    @JsonProperty("build_identifier")
    public DeviceInfo setBuildIdentifier(String buildIdentifier) {
        this.buildIdentifier = buildIdentifier;
        return this;
    }

    /**
     * @return The brand
     */
    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand The brand
     */
    @JsonProperty("brand")
    public DeviceInfo setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    /**
     * @return The product
     */
    @JsonProperty("product")
    public String getProduct() {
        return product;
    }

    /**
     * @param product The product
     */
    @JsonProperty("product")
    public DeviceInfo setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * @return The device
     */
    @JsonProperty("device")
    public String getDevice() {
        return device;
    }

    /**
     * @param device The device
     */
    @JsonProperty("device")
    public DeviceInfo setDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * @return The deviceManufacturer
     */
    @JsonProperty("device_manufacturer")
    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }

    /**
     * @param deviceManufacturer The device_manufacturer
     */
    @JsonProperty("device_manufacturer")
    public DeviceInfo setDeviceManufacturer(String deviceManufacturer) {
        this.deviceManufacturer = deviceManufacturer;
        return this;
    }

    /**
     * @return The platform
     */
    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    /**
     * @param platform The platform
     */
    @JsonProperty("platform")
    public DeviceInfo setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * @return The osVersion
     */
    @JsonProperty("os_version")
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * @param osVersion The os_version
     */
    @JsonProperty("os_version")
    public DeviceInfo setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * @return The deviceModel
     */
    @JsonProperty("device_model")
    public String getDeviceModel() {
        return deviceModel;
    }

    /**
     * @param deviceModel The device_model
     */
    @JsonProperty("device_model")
    public DeviceInfo setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }

    /**
     * @return The screenHeight
     */
    @JsonProperty("screen_height")
    public Integer getScreenHeight() {
        return screenHeight;
    }

    /**
     * @param screenHeight The screen_height
     */
    @JsonProperty("screen_height")
    public DeviceInfo setScreenHeight(Integer screenHeight) {
        this.screenHeight = screenHeight;
        return this;
    }

    /**
     * @return The screenWidth
     */
    @JsonProperty("screen_width")
    public Integer getScreenWidth() {
        return screenWidth;
    }

    /**
     * @param screenWidth The screen_width
     */
    @JsonProperty("screen_width")
    public DeviceInfo setScreenWidth(Integer screenWidth) {
        this.screenWidth = screenWidth;
        return this;
    }

    /**
     * @return The screenDpi
     */
    @JsonProperty("screen_dpi")
    public Integer getScreenDpi() {
        return screenDpi;
    }

    /**
     * @param screenDpi The screen_dpi
     */
    @JsonProperty("screen_dpi")
    public DeviceInfo setScreenDpi(Integer screenDpi) {
        this.screenDpi = screenDpi;
        return this;
    }

    /**
     * @return The isTablet
     */
    @JsonProperty("is_tablet")
    public Boolean getIsTablet() {
        return isTablet;
    }

    /**
     * @param isTablet The is_tablet
     */
    @JsonProperty("is_tablet")
    public DeviceInfo setIsTablet(Boolean isTablet) {
        this.isTablet = isTablet;
        return this;
    }

    /**
     * @return The deviceCountry
     */
    @JsonProperty("device_country")
    public String getDeviceCountry() {
        return deviceCountry;
    }

    /**
     * @param deviceCountry The device_country
     */
    @JsonProperty("device_country")
    public DeviceInfo setDeviceCountry(String deviceCountry) {
        this.deviceCountry = deviceCountry;
        return this;
    }

    /**
     * @return The localeCountry
     */
    @JsonProperty("locale_country")
    public String getLocaleCountry() {
        return localeCountry;
    }

    /**
     * @param localeCountry The locale_country
     */
    @JsonProperty("locale_country")
    public DeviceInfo setLocaleCountry(String localeCountry) {
        this.localeCountry = localeCountry;
        return this;
    }

    /**
     * @return The localeLanguage
     */
    @JsonProperty("locale_language")
    public String getLocaleLanguage() {
        return localeLanguage;
    }

    /**
     * @param localeLanguage The locale_language
     */
    @JsonProperty("locale_language")
    public DeviceInfo setLocaleLanguage(String localeLanguage) {
        this.localeLanguage = localeLanguage;
        return this;
    }

    /**
     * @return The networkCountry
     */
    @JsonProperty("network_country")
    public String getNetworkCountry() {
        return networkCountry;
    }

    /**
     * @param networkCountry The network_country
     */
    @JsonProperty("network_country")
    public DeviceInfo setNetworkCountry(String networkCountry) {
        this.networkCountry = networkCountry;
        return this;
    }

    /**
     * @return The networkCarrier
     */
    @JsonProperty("network_carrier")
    public String getNetworkCarrier() {
        return networkCarrier;
    }

    /**
     * @param networkCarrier The network_carrier
     */
    @JsonProperty("network_carrier")
    public DeviceInfo setNetworkCarrier(String networkCarrier) {
        this.networkCarrier = networkCarrier;
        return this;
    }

    /**
     * @return The networkCode
     */
    @JsonProperty("network_code")
    public String getNetworkCode() {
        return networkCode;
    }

    /**
     * @param networkCode The network_code
     */
    @JsonProperty("network_code")
    public DeviceInfo setNetworkCode(String networkCode) {
        this.networkCode = networkCode;
        return this;
    }

    /**
     * @return The networkMobileCountryCode
     */
    @JsonProperty("network_mobile_country_code")
    public String getNetworkMobileCountryCode() {
        return networkMobileCountryCode;
    }

    /**
     * @param networkMobileCountryCode The network_mobile_country_code
     */
    @JsonProperty("network_mobile_country_code")
    public DeviceInfo setNetworkMobileCountryCode(String networkMobileCountryCode) {
        this.networkMobileCountryCode = networkMobileCountryCode;
        return this;
    }

    /**
     * @return The timezoneOffset
     */
    @JsonProperty("timezone_offset")
    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * @param timezoneOffset The timezone_offset
     */
    @JsonProperty("timezone_offset")
    public DeviceInfo setTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    /**
     * @return The androidUuid
     */
    @JsonProperty("android_uuid")
    public String getAndroidUuid() {
        return androidUuid;
    }

    /**
     * @param androidUuid The android_uuid
     */
    @JsonProperty("android_uuid")
    public DeviceInfo setAndroidUuid(String androidUuid) {
        this.androidUuid = androidUuid;
        return this;
    }

    /**
     * @return The iosAdvertisingId
     */
    @JsonProperty("ios_advertising_id")
    public String getIosAdvertisingId() {
        return iosAdvertisingId;
    }

    /**
     * @param iosAdvertisingId The ios_advertising_id
     */
    @JsonProperty("ios_advertising_id")
    public DeviceInfo setIosAdvertisingId(String iosAdvertisingId) {
        this.iosAdvertisingId = iosAdvertisingId;
        return this;
    }

    /**
     * @return The iosIdfv
     */
    @JsonProperty("ios_idfv")
    public String getIosIdfv() {
        return iosIdfv;
    }

    /**
     * @param iosIdfv The ios_idfv
     */
    @JsonProperty("ios_idfv")
    public DeviceInfo setIosIdfv(String iosIdfv) {
        this.iosIdfv = iosIdfv;
        return this;
    }

    /**
     * @return The androidAdvertisingId
     */
    @JsonProperty("android_advertising_id")
    public String getAndroidAdvertisingId() {
        return androidAdvertisingId;
    }

    /**
     * @param androidAdvertisingId The android_advertising_id
     */
    @JsonProperty("android_advertising_id")
    public DeviceInfo setAndroidAdvertisingId(String androidAdvertisingId) {
        this.androidAdvertisingId = androidAdvertisingId;
        return this;
    }

    /**
     * @return The httpHeaderUserAgent
     */
    @JsonProperty("http_header_user_agent")
    public String getHttpHeaderUserAgent() {
        return httpHeaderUserAgent;
    }

    /**
     * @param httpHeaderUserAgent The http_header_user_agent
     */
    @JsonProperty("http_header_user_agent")
    public DeviceInfo setHttpHeaderUserAgent(String httpHeaderUserAgent) {
        this.httpHeaderUserAgent = httpHeaderUserAgent;
        return this;
    }

    /**
     * @return The pushToken
     */
    @JsonProperty("push_token")
    public String getPushToken() {
        return pushToken;
    }

    /**
     * @param pushToken The push_token
     */
    @JsonProperty("push_token")
    public DeviceInfo setPushToken(String pushToken) {
        this.pushToken = pushToken;
        return this;
    }

    /**
     * @return The cpuArchitecture
     */
    @JsonProperty("cpu_architecture")
    public String getCpuArchitecture() {
        return cpuArchitecture;
    }

    /**
     * @param cpuArchitecture The cpu_architecture
     */
    @JsonProperty("cpu_architecture")
    public DeviceInfo setCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
        return this;
    }

    /**
     * @return The pushNotificationSoundEnabled
     */
    @JsonProperty("push_notification_sound_enabled")
    public Boolean getPushNotificationSoundEnabled() {
        return pushNotificationSoundEnabled;
    }

    /**
     * @param pushNotificationSoundEnabled The push_notification_sound_enabled
     */
    @JsonProperty("push_notification_sound_enabled")
    public DeviceInfo setPushNotificationSoundEnabled(Boolean pushNotificationSoundEnabled) {
        this.pushNotificationSoundEnabled = pushNotificationSoundEnabled;
        return this;
    }

    /**
     * @return The pushNotificationVibrateEnabled
     */
    @JsonProperty("push_notification_vibrate_enabled")
    public Boolean getPushNotificationVibrateEnabled() {
        return pushNotificationVibrateEnabled;
    }

    /**
     * @param pushNotificationVibrateEnabled The push_notification_vibrate_enabled
     */
    @JsonProperty("push_notification_vibrate_enabled")
    public DeviceInfo setPushNotificationVibrateEnabled(Boolean pushNotificationVibrateEnabled) {
        this.pushNotificationVibrateEnabled = pushNotificationVibrateEnabled;
        return this;
    }

    /**
     * @return The radioAccessTechnology
     */
    @JsonProperty("radio_access_technology")
    public String getRadioAccessTechnology() {
        return radioAccessTechnology;
    }

    /**
     * @param radioAccessTechnology The radio_access_technology
     */
    @JsonProperty("radio_access_technology")
    public DeviceInfo setRadioAccessTechnology(String radioAccessTechnology) {
        this.radioAccessTechnology = radioAccessTechnology;
        return this;
    }

    /**
     * @return The supportsTelephony
     */
    @JsonProperty("supports_telephony")
    public String getSupportsTelephony() {
        return supportsTelephony;
    }

    /**
     * @param supportsTelephony The supports_telephony
     */
    @JsonProperty("supports_telephony")
    public DeviceInfo setSupportsTelephony(String supportsTelephony) {
        this.supportsTelephony = supportsTelephony;
        return this;
    }

    /**
     * @return The hasNfc
     */
    @JsonProperty("has_nfc")
    public Boolean getHasNfc() {
        return hasNfc;
    }

    /**
     * @param hasNfc The has_nfc
     */
    @JsonProperty("has_nfc")
    public DeviceInfo setHasNfc(Boolean hasNfc) {
        this.hasNfc = hasNfc;
        return this;
    }

    /**
     * @return The bluetoothEnabled
     */
    @JsonProperty("bluetooth_enabled")
    public Boolean getBluetoothEnabled() {
        return bluetoothEnabled;
    }

    /**
     * @param bluetoothEnabled The bluetooth_enabled
     */
    @JsonProperty("bluetooth_enabled")
    public DeviceInfo setBluetoothEnabled(Boolean bluetoothEnabled) {
        this.bluetoothEnabled = bluetoothEnabled;
        return this;
    }

    /**
     * @return The bluetoothVersion
     */
    @JsonProperty("bluetooth_version")
    public String getBluetoothVersion() {
        return bluetoothVersion;
    }

    /**
     * @param bluetoothVersion The bluetooth_version
     */
    @JsonProperty("bluetooth_version")
    public DeviceInfo setBluetoothVersion(String bluetoothVersion) {
        this.bluetoothVersion = bluetoothVersion;
        return this;
    }
}
