# J2FA
方便开发人员，登录国外账号，进行多因子认证2FA时，code码的生成。

# 如何使用
当前项目为maven项目，下载后直接构建好，运行TOTPGenerator的main方法。在运行main方法前请修改“此地为2FA生成的Key”。
OTP.create("此地为2FA生成的Key", hexTime, 6, Type.TOTP);
