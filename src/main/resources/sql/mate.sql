/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : localhost:3306
 Source Schema         : population

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : 65001

 Date: 29/12/2020 17:40:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mate
-- ----------------------------
DROP TABLE IF EXISTS `mate`;
CREATE TABLE `mate`  (
  `ma_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '配偶表ID',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `mate_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '配偶姓名',
  `mate_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '配偶身份证号',
  `mate_province` int(11) NULL DEFAULT NULL COMMENT '现居住地(省)',
  `mate_city` int(11) NULL DEFAULT NULL COMMENT '现居住地(市)',
  `mate_county` int(11) NULL DEFAULT NULL COMMENT '现居住地(县)',
  `mate_area` int(11) NULL DEFAULT NULL COMMENT '现居住地(乡镇)',
  `mate_village` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '现居住地(村)',
  `background` int(11) NULL DEFAULT NULL COMMENT '从业状况(字典)',
  `work_unit` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '工作单位',
  `mate_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '配偶电话',
  `del_id` int(10) NULL DEFAULT 0 COMMENT '删除标识',
  `gmt_create` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `gmt_moeified` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `spare_str` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '备用字段str',
  `spare_int` int(11) NULL DEFAULT NULL COMMENT '备用字段int',
  PRIMARY KEY (`ma_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
