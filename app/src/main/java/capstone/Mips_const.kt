// For Capstone Engine. AUTO-GENERATED FILE, DO NOT EDIT
package capstone

import capstone.Mips_const

object Mips_const {
    // Operand type for instruction's operands
    const val MIPS_OP_INVALID = 0
    const val MIPS_OP_REG = 1
    const val MIPS_OP_IMM = 2
    const val MIPS_OP_MEM = 3

    // MIPS registers
    const val MIPS_REG_INVALID = 0

    // General purpose registers
    const val MIPS_REG_0 = 1
    const val MIPS_REG_1 = 2
    const val MIPS_REG_2 = 3
    const val MIPS_REG_3 = 4
    const val MIPS_REG_4 = 5
    const val MIPS_REG_5 = 6
    const val MIPS_REG_6 = 7
    const val MIPS_REG_7 = 8
    const val MIPS_REG_8 = 9
    const val MIPS_REG_9 = 10
    const val MIPS_REG_10 = 11
    const val MIPS_REG_11 = 12
    const val MIPS_REG_12 = 13
    const val MIPS_REG_13 = 14
    const val MIPS_REG_14 = 15
    const val MIPS_REG_15 = 16
    const val MIPS_REG_16 = 17
    const val MIPS_REG_17 = 18
    const val MIPS_REG_18 = 19
    const val MIPS_REG_19 = 20
    const val MIPS_REG_20 = 21
    const val MIPS_REG_21 = 22
    const val MIPS_REG_22 = 23
    const val MIPS_REG_23 = 24
    const val MIPS_REG_24 = 25
    const val MIPS_REG_25 = 26
    const val MIPS_REG_26 = 27
    const val MIPS_REG_27 = 28
    const val MIPS_REG_28 = 29
    const val MIPS_REG_29 = 30
    const val MIPS_REG_30 = 31
    const val MIPS_REG_31 = 32

    // DSP registers
    const val MIPS_REG_DSPCCOND = 33
    const val MIPS_REG_DSPCARRY = 34
    const val MIPS_REG_DSPEFI = 35
    const val MIPS_REG_DSPOUTFLAG = 36
    const val MIPS_REG_DSPOUTFLAG16_19 = 37
    const val MIPS_REG_DSPOUTFLAG20 = 38
    const val MIPS_REG_DSPOUTFLAG21 = 39
    const val MIPS_REG_DSPOUTFLAG22 = 40
    const val MIPS_REG_DSPOUTFLAG23 = 41
    const val MIPS_REG_DSPPOS = 42
    const val MIPS_REG_DSPSCOUNT = 43

    // ACC registers
    const val MIPS_REG_AC0 = 44
    const val MIPS_REG_AC1 = 45
    const val MIPS_REG_AC2 = 46
    const val MIPS_REG_AC3 = 47

    // COP registers
    const val MIPS_REG_CC0 = 48
    const val MIPS_REG_CC1 = 49
    const val MIPS_REG_CC2 = 50
    const val MIPS_REG_CC3 = 51
    const val MIPS_REG_CC4 = 52
    const val MIPS_REG_CC5 = 53
    const val MIPS_REG_CC6 = 54
    const val MIPS_REG_CC7 = 55

    // FPU registers
    const val MIPS_REG_F0 = 56
    const val MIPS_REG_F1 = 57
    const val MIPS_REG_F2 = 58
    const val MIPS_REG_F3 = 59
    const val MIPS_REG_F4 = 60
    const val MIPS_REG_F5 = 61
    const val MIPS_REG_F6 = 62
    const val MIPS_REG_F7 = 63
    const val MIPS_REG_F8 = 64
    const val MIPS_REG_F9 = 65
    const val MIPS_REG_F10 = 66
    const val MIPS_REG_F11 = 67
    const val MIPS_REG_F12 = 68
    const val MIPS_REG_F13 = 69
    const val MIPS_REG_F14 = 70
    const val MIPS_REG_F15 = 71
    const val MIPS_REG_F16 = 72
    const val MIPS_REG_F17 = 73
    const val MIPS_REG_F18 = 74
    const val MIPS_REG_F19 = 75
    const val MIPS_REG_F20 = 76
    const val MIPS_REG_F21 = 77
    const val MIPS_REG_F22 = 78
    const val MIPS_REG_F23 = 79
    const val MIPS_REG_F24 = 80
    const val MIPS_REG_F25 = 81
    const val MIPS_REG_F26 = 82
    const val MIPS_REG_F27 = 83
    const val MIPS_REG_F28 = 84
    const val MIPS_REG_F29 = 85
    const val MIPS_REG_F30 = 86
    const val MIPS_REG_F31 = 87
    const val MIPS_REG_FCC0 = 88
    const val MIPS_REG_FCC1 = 89
    const val MIPS_REG_FCC2 = 90
    const val MIPS_REG_FCC3 = 91
    const val MIPS_REG_FCC4 = 92
    const val MIPS_REG_FCC5 = 93
    const val MIPS_REG_FCC6 = 94
    const val MIPS_REG_FCC7 = 95

    // AFPR128
    const val MIPS_REG_W0 = 96
    const val MIPS_REG_W1 = 97
    const val MIPS_REG_W2 = 98
    const val MIPS_REG_W3 = 99
    const val MIPS_REG_W4 = 100
    const val MIPS_REG_W5 = 101
    const val MIPS_REG_W6 = 102
    const val MIPS_REG_W7 = 103
    const val MIPS_REG_W8 = 104
    const val MIPS_REG_W9 = 105
    const val MIPS_REG_W10 = 106
    const val MIPS_REG_W11 = 107
    const val MIPS_REG_W12 = 108
    const val MIPS_REG_W13 = 109
    const val MIPS_REG_W14 = 110
    const val MIPS_REG_W15 = 111
    const val MIPS_REG_W16 = 112
    const val MIPS_REG_W17 = 113
    const val MIPS_REG_W18 = 114
    const val MIPS_REG_W19 = 115
    const val MIPS_REG_W20 = 116
    const val MIPS_REG_W21 = 117
    const val MIPS_REG_W22 = 118
    const val MIPS_REG_W23 = 119
    const val MIPS_REG_W24 = 120
    const val MIPS_REG_W25 = 121
    const val MIPS_REG_W26 = 122
    const val MIPS_REG_W27 = 123
    const val MIPS_REG_W28 = 124
    const val MIPS_REG_W29 = 125
    const val MIPS_REG_W30 = 126
    const val MIPS_REG_W31 = 127
    const val MIPS_REG_HI = 128
    const val MIPS_REG_LO = 129
    const val MIPS_REG_P0 = 130
    const val MIPS_REG_P1 = 131
    const val MIPS_REG_P2 = 132
    const val MIPS_REG_MPL0 = 133
    const val MIPS_REG_MPL1 = 134
    const val MIPS_REG_MPL2 = 135
    const val MIPS_REG_ENDING = 136
    const val MIPS_REG_ZERO = MIPS_REG_0
    const val MIPS_REG_AT = MIPS_REG_1
    const val MIPS_REG_V0 = MIPS_REG_2
    const val MIPS_REG_V1 = MIPS_REG_3
    const val MIPS_REG_A0 = MIPS_REG_4
    const val MIPS_REG_A1 = MIPS_REG_5
    const val MIPS_REG_A2 = MIPS_REG_6
    const val MIPS_REG_A3 = MIPS_REG_7
    const val MIPS_REG_T0 = MIPS_REG_8
    const val MIPS_REG_T1 = MIPS_REG_9
    const val MIPS_REG_T2 = MIPS_REG_10
    const val MIPS_REG_T3 = MIPS_REG_11
    const val MIPS_REG_T4 = MIPS_REG_12
    const val MIPS_REG_T5 = MIPS_REG_13
    const val MIPS_REG_T6 = MIPS_REG_14
    const val MIPS_REG_T7 = MIPS_REG_15
    const val MIPS_REG_S0 = MIPS_REG_16
    const val MIPS_REG_S1 = MIPS_REG_17
    const val MIPS_REG_S2 = MIPS_REG_18
    const val MIPS_REG_S3 = MIPS_REG_19
    const val MIPS_REG_S4 = MIPS_REG_20
    const val MIPS_REG_S5 = MIPS_REG_21
    const val MIPS_REG_S6 = MIPS_REG_22
    const val MIPS_REG_S7 = MIPS_REG_23
    const val MIPS_REG_T8 = MIPS_REG_24
    const val MIPS_REG_T9 = MIPS_REG_25
    const val MIPS_REG_K0 = MIPS_REG_26
    const val MIPS_REG_K1 = MIPS_REG_27
    const val MIPS_REG_GP = MIPS_REG_28
    const val MIPS_REG_SP = MIPS_REG_29
    const val MIPS_REG_FP = MIPS_REG_30
    const val MIPS_REG_S8 = MIPS_REG_30
    const val MIPS_REG_RA = MIPS_REG_31
    const val MIPS_REG_HI0 = MIPS_REG_AC0
    const val MIPS_REG_HI1 = MIPS_REG_AC1
    const val MIPS_REG_HI2 = MIPS_REG_AC2
    const val MIPS_REG_HI3 = MIPS_REG_AC3
    const val MIPS_REG_LO0 = MIPS_REG_HI0
    const val MIPS_REG_LO1 = MIPS_REG_HI1
    const val MIPS_REG_LO2 = MIPS_REG_HI2
    const val MIPS_REG_LO3 = MIPS_REG_HI3

    // MIPS instruction
    const val MIPS_INS_INVALID = 0
    const val MIPS_INS_ABSQ_S = 1
    const val MIPS_INS_ADD = 2
    const val MIPS_INS_ADDIUPC = 3
    const val MIPS_INS_ADDQH = 4
    const val MIPS_INS_ADDQH_R = 5
    const val MIPS_INS_ADDQ = 6
    const val MIPS_INS_ADDQ_S = 7
    const val MIPS_INS_ADDSC = 8
    const val MIPS_INS_ADDS_A = 9
    const val MIPS_INS_ADDS_S = 10
    const val MIPS_INS_ADDS_U = 11
    const val MIPS_INS_ADDUH = 12
    const val MIPS_INS_ADDUH_R = 13
    const val MIPS_INS_ADDU = 14
    const val MIPS_INS_ADDU_S = 15
    const val MIPS_INS_ADDVI = 16
    const val MIPS_INS_ADDV = 17
    const val MIPS_INS_ADDWC = 18
    const val MIPS_INS_ADD_A = 19
    const val MIPS_INS_ADDI = 20
    const val MIPS_INS_ADDIU = 21
    const val MIPS_INS_ALIGN = 22
    const val MIPS_INS_ALUIPC = 23
    const val MIPS_INS_AND = 24
    const val MIPS_INS_ANDI = 25
    const val MIPS_INS_APPEND = 26
    const val MIPS_INS_ASUB_S = 27
    const val MIPS_INS_ASUB_U = 28
    const val MIPS_INS_AUI = 29
    const val MIPS_INS_AUIPC = 30
    const val MIPS_INS_AVER_S = 31
    const val MIPS_INS_AVER_U = 32
    const val MIPS_INS_AVE_S = 33
    const val MIPS_INS_AVE_U = 34
    const val MIPS_INS_BADDU = 35
    const val MIPS_INS_BAL = 36
    const val MIPS_INS_BALC = 37
    const val MIPS_INS_BALIGN = 38
    const val MIPS_INS_BC = 39
    const val MIPS_INS_BC0F = 40
    const val MIPS_INS_BC0FL = 41
    const val MIPS_INS_BC0T = 42
    const val MIPS_INS_BC0TL = 43
    const val MIPS_INS_BC1EQZ = 44
    const val MIPS_INS_BC1F = 45
    const val MIPS_INS_BC1FL = 46
    const val MIPS_INS_BC1NEZ = 47
    const val MIPS_INS_BC1T = 48
    const val MIPS_INS_BC1TL = 49
    const val MIPS_INS_BC2EQZ = 50
    const val MIPS_INS_BC2F = 51
    const val MIPS_INS_BC2FL = 52
    const val MIPS_INS_BC2NEZ = 53
    const val MIPS_INS_BC2T = 54
    const val MIPS_INS_BC2TL = 55
    const val MIPS_INS_BC3F = 56
    const val MIPS_INS_BC3FL = 57
    const val MIPS_INS_BC3T = 58
    const val MIPS_INS_BC3TL = 59
    const val MIPS_INS_BCLRI = 60
    const val MIPS_INS_BCLR = 61
    const val MIPS_INS_BEQ = 62
    const val MIPS_INS_BEQC = 63
    const val MIPS_INS_BEQL = 64
    const val MIPS_INS_BEQZALC = 65
    const val MIPS_INS_BEQZC = 66
    const val MIPS_INS_BGEC = 67
    const val MIPS_INS_BGEUC = 68
    const val MIPS_INS_BGEZ = 69
    const val MIPS_INS_BGEZAL = 70
    const val MIPS_INS_BGEZALC = 71
    const val MIPS_INS_BGEZALL = 72
    const val MIPS_INS_BGEZALS = 73
    const val MIPS_INS_BGEZC = 74
    const val MIPS_INS_BGEZL = 75
    const val MIPS_INS_BGTZ = 76
    const val MIPS_INS_BGTZALC = 77
    const val MIPS_INS_BGTZC = 78
    const val MIPS_INS_BGTZL = 79
    const val MIPS_INS_BINSLI = 80
    const val MIPS_INS_BINSL = 81
    const val MIPS_INS_BINSRI = 82
    const val MIPS_INS_BINSR = 83
    const val MIPS_INS_BITREV = 84
    const val MIPS_INS_BITSWAP = 85
    const val MIPS_INS_BLEZ = 86
    const val MIPS_INS_BLEZALC = 87
    const val MIPS_INS_BLEZC = 88
    const val MIPS_INS_BLEZL = 89
    const val MIPS_INS_BLTC = 90
    const val MIPS_INS_BLTUC = 91
    const val MIPS_INS_BLTZ = 92
    const val MIPS_INS_BLTZAL = 93
    const val MIPS_INS_BLTZALC = 94
    const val MIPS_INS_BLTZALL = 95
    const val MIPS_INS_BLTZALS = 96
    const val MIPS_INS_BLTZC = 97
    const val MIPS_INS_BLTZL = 98
    const val MIPS_INS_BMNZI = 99
    const val MIPS_INS_BMNZ = 100
    const val MIPS_INS_BMZI = 101
    const val MIPS_INS_BMZ = 102
    const val MIPS_INS_BNE = 103
    const val MIPS_INS_BNEC = 104
    const val MIPS_INS_BNEGI = 105
    const val MIPS_INS_BNEG = 106
    const val MIPS_INS_BNEL = 107
    const val MIPS_INS_BNEZALC = 108
    const val MIPS_INS_BNEZC = 109
    const val MIPS_INS_BNVC = 110
    const val MIPS_INS_BNZ = 111
    const val MIPS_INS_BOVC = 112
    const val MIPS_INS_BPOSGE32 = 113
    const val MIPS_INS_BREAK = 114
    const val MIPS_INS_BSELI = 115
    const val MIPS_INS_BSEL = 116
    const val MIPS_INS_BSETI = 117
    const val MIPS_INS_BSET = 118
    const val MIPS_INS_BZ = 119
    const val MIPS_INS_BEQZ = 120
    const val MIPS_INS_B = 121
    const val MIPS_INS_BNEZ = 122
    const val MIPS_INS_BTEQZ = 123
    const val MIPS_INS_BTNEZ = 124
    const val MIPS_INS_CACHE = 125
    const val MIPS_INS_CEIL = 126
    const val MIPS_INS_CEQI = 127
    const val MIPS_INS_CEQ = 128
    const val MIPS_INS_CFC1 = 129
    const val MIPS_INS_CFCMSA = 130
    const val MIPS_INS_CINS = 131
    const val MIPS_INS_CINS32 = 132
    const val MIPS_INS_CLASS = 133
    const val MIPS_INS_CLEI_S = 134
    const val MIPS_INS_CLEI_U = 135
    const val MIPS_INS_CLE_S = 136
    const val MIPS_INS_CLE_U = 137
    const val MIPS_INS_CLO = 138
    const val MIPS_INS_CLTI_S = 139
    const val MIPS_INS_CLTI_U = 140
    const val MIPS_INS_CLT_S = 141
    const val MIPS_INS_CLT_U = 142
    const val MIPS_INS_CLZ = 143
    const val MIPS_INS_CMPGDU = 144
    const val MIPS_INS_CMPGU = 145
    const val MIPS_INS_CMPU = 146
    const val MIPS_INS_CMP = 147
    const val MIPS_INS_COPY_S = 148
    const val MIPS_INS_COPY_U = 149
    const val MIPS_INS_CTC1 = 150
    const val MIPS_INS_CTCMSA = 151
    const val MIPS_INS_CVT = 152
    const val MIPS_INS_C = 153
    const val MIPS_INS_CMPI = 154
    const val MIPS_INS_DADD = 155
    const val MIPS_INS_DADDI = 156
    const val MIPS_INS_DADDIU = 157
    const val MIPS_INS_DADDU = 158
    const val MIPS_INS_DAHI = 159
    const val MIPS_INS_DALIGN = 160
    const val MIPS_INS_DATI = 161
    const val MIPS_INS_DAUI = 162
    const val MIPS_INS_DBITSWAP = 163
    const val MIPS_INS_DCLO = 164
    const val MIPS_INS_DCLZ = 165
    const val MIPS_INS_DDIV = 166
    const val MIPS_INS_DDIVU = 167
    const val MIPS_INS_DERET = 168
    const val MIPS_INS_DEXT = 169
    const val MIPS_INS_DEXTM = 170
    const val MIPS_INS_DEXTU = 171
    const val MIPS_INS_DI = 172
    const val MIPS_INS_DINS = 173
    const val MIPS_INS_DINSM = 174
    const val MIPS_INS_DINSU = 175
    const val MIPS_INS_DIV = 176
    const val MIPS_INS_DIVU = 177
    const val MIPS_INS_DIV_S = 178
    const val MIPS_INS_DIV_U = 179
    const val MIPS_INS_DLSA = 180
    const val MIPS_INS_DMFC0 = 181
    const val MIPS_INS_DMFC1 = 182
    const val MIPS_INS_DMFC2 = 183
    const val MIPS_INS_DMOD = 184
    const val MIPS_INS_DMODU = 185
    const val MIPS_INS_DMTC0 = 186
    const val MIPS_INS_DMTC1 = 187
    const val MIPS_INS_DMTC2 = 188
    const val MIPS_INS_DMUH = 189
    const val MIPS_INS_DMUHU = 190
    const val MIPS_INS_DMUL = 191
    const val MIPS_INS_DMULT = 192
    const val MIPS_INS_DMULTU = 193
    const val MIPS_INS_DMULU = 194
    const val MIPS_INS_DOTP_S = 195
    const val MIPS_INS_DOTP_U = 196
    const val MIPS_INS_DPADD_S = 197
    const val MIPS_INS_DPADD_U = 198
    const val MIPS_INS_DPAQX_SA = 199
    const val MIPS_INS_DPAQX_S = 200
    const val MIPS_INS_DPAQ_SA = 201
    const val MIPS_INS_DPAQ_S = 202
    const val MIPS_INS_DPAU = 203
    const val MIPS_INS_DPAX = 204
    const val MIPS_INS_DPA = 205
    const val MIPS_INS_DPOP = 206
    const val MIPS_INS_DPSQX_SA = 207
    const val MIPS_INS_DPSQX_S = 208
    const val MIPS_INS_DPSQ_SA = 209
    const val MIPS_INS_DPSQ_S = 210
    const val MIPS_INS_DPSUB_S = 211
    const val MIPS_INS_DPSUB_U = 212
    const val MIPS_INS_DPSU = 213
    const val MIPS_INS_DPSX = 214
    const val MIPS_INS_DPS = 215
    const val MIPS_INS_DROTR = 216
    const val MIPS_INS_DROTR32 = 217
    const val MIPS_INS_DROTRV = 218
    const val MIPS_INS_DSBH = 219
    const val MIPS_INS_DSHD = 220
    const val MIPS_INS_DSLL = 221
    const val MIPS_INS_DSLL32 = 222
    const val MIPS_INS_DSLLV = 223
    const val MIPS_INS_DSRA = 224
    const val MIPS_INS_DSRA32 = 225
    const val MIPS_INS_DSRAV = 226
    const val MIPS_INS_DSRL = 227
    const val MIPS_INS_DSRL32 = 228
    const val MIPS_INS_DSRLV = 229
    const val MIPS_INS_DSUB = 230
    const val MIPS_INS_DSUBU = 231
    const val MIPS_INS_EHB = 232
    const val MIPS_INS_EI = 233
    const val MIPS_INS_ERET = 234
    const val MIPS_INS_EXT = 235
    const val MIPS_INS_EXTP = 236
    const val MIPS_INS_EXTPDP = 237
    const val MIPS_INS_EXTPDPV = 238
    const val MIPS_INS_EXTPV = 239
    const val MIPS_INS_EXTRV_RS = 240
    const val MIPS_INS_EXTRV_R = 241
    const val MIPS_INS_EXTRV_S = 242
    const val MIPS_INS_EXTRV = 243
    const val MIPS_INS_EXTR_RS = 244
    const val MIPS_INS_EXTR_R = 245
    const val MIPS_INS_EXTR_S = 246
    const val MIPS_INS_EXTR = 247
    const val MIPS_INS_EXTS = 248
    const val MIPS_INS_EXTS32 = 249
    const val MIPS_INS_ABS = 250
    const val MIPS_INS_FADD = 251
    const val MIPS_INS_FCAF = 252
    const val MIPS_INS_FCEQ = 253
    const val MIPS_INS_FCLASS = 254
    const val MIPS_INS_FCLE = 255
    const val MIPS_INS_FCLT = 256
    const val MIPS_INS_FCNE = 257
    const val MIPS_INS_FCOR = 258
    const val MIPS_INS_FCUEQ = 259
    const val MIPS_INS_FCULE = 260
    const val MIPS_INS_FCULT = 261
    const val MIPS_INS_FCUNE = 262
    const val MIPS_INS_FCUN = 263
    const val MIPS_INS_FDIV = 264
    const val MIPS_INS_FEXDO = 265
    const val MIPS_INS_FEXP2 = 266
    const val MIPS_INS_FEXUPL = 267
    const val MIPS_INS_FEXUPR = 268
    const val MIPS_INS_FFINT_S = 269
    const val MIPS_INS_FFINT_U = 270
    const val MIPS_INS_FFQL = 271
    const val MIPS_INS_FFQR = 272
    const val MIPS_INS_FILL = 273
    const val MIPS_INS_FLOG2 = 274
    const val MIPS_INS_FLOOR = 275
    const val MIPS_INS_FMADD = 276
    const val MIPS_INS_FMAX_A = 277
    const val MIPS_INS_FMAX = 278
    const val MIPS_INS_FMIN_A = 279
    const val MIPS_INS_FMIN = 280
    const val MIPS_INS_MOV = 281
    const val MIPS_INS_FMSUB = 282
    const val MIPS_INS_FMUL = 283
    const val MIPS_INS_MUL = 284
    const val MIPS_INS_NEG = 285
    const val MIPS_INS_FRCP = 286
    const val MIPS_INS_FRINT = 287
    const val MIPS_INS_FRSQRT = 288
    const val MIPS_INS_FSAF = 289
    const val MIPS_INS_FSEQ = 290
    const val MIPS_INS_FSLE = 291
    const val MIPS_INS_FSLT = 292
    const val MIPS_INS_FSNE = 293
    const val MIPS_INS_FSOR = 294
    const val MIPS_INS_FSQRT = 295
    const val MIPS_INS_SQRT = 296
    const val MIPS_INS_FSUB = 297
    const val MIPS_INS_SUB = 298
    const val MIPS_INS_FSUEQ = 299
    const val MIPS_INS_FSULE = 300
    const val MIPS_INS_FSULT = 301
    const val MIPS_INS_FSUNE = 302
    const val MIPS_INS_FSUN = 303
    const val MIPS_INS_FTINT_S = 304
    const val MIPS_INS_FTINT_U = 305
    const val MIPS_INS_FTQ = 306
    const val MIPS_INS_FTRUNC_S = 307
    const val MIPS_INS_FTRUNC_U = 308
    const val MIPS_INS_HADD_S = 309
    const val MIPS_INS_HADD_U = 310
    const val MIPS_INS_HSUB_S = 311
    const val MIPS_INS_HSUB_U = 312
    const val MIPS_INS_ILVEV = 313
    const val MIPS_INS_ILVL = 314
    const val MIPS_INS_ILVOD = 315
    const val MIPS_INS_ILVR = 316
    const val MIPS_INS_INS = 317
    const val MIPS_INS_INSERT = 318
    const val MIPS_INS_INSV = 319
    const val MIPS_INS_INSVE = 320
    const val MIPS_INS_J = 321
    const val MIPS_INS_JAL = 322
    const val MIPS_INS_JALR = 323
    const val MIPS_INS_JALRS = 324
    const val MIPS_INS_JALS = 325
    const val MIPS_INS_JALX = 326
    const val MIPS_INS_JIALC = 327
    const val MIPS_INS_JIC = 328
    const val MIPS_INS_JR = 329
    const val MIPS_INS_JRADDIUSP = 330
    const val MIPS_INS_JRC = 331
    const val MIPS_INS_JALRC = 332
    const val MIPS_INS_LB = 333
    const val MIPS_INS_LBUX = 334
    const val MIPS_INS_LBU = 335
    const val MIPS_INS_LD = 336
    const val MIPS_INS_LDC1 = 337
    const val MIPS_INS_LDC2 = 338
    const val MIPS_INS_LDC3 = 339
    const val MIPS_INS_LDI = 340
    const val MIPS_INS_LDL = 341
    const val MIPS_INS_LDPC = 342
    const val MIPS_INS_LDR = 343
    const val MIPS_INS_LDXC1 = 344
    const val MIPS_INS_LH = 345
    const val MIPS_INS_LHX = 346
    const val MIPS_INS_LHU = 347
    const val MIPS_INS_LL = 348
    const val MIPS_INS_LLD = 349
    const val MIPS_INS_LSA = 350
    const val MIPS_INS_LUXC1 = 351
    const val MIPS_INS_LUI = 352
    const val MIPS_INS_LW = 353
    const val MIPS_INS_LWC1 = 354
    const val MIPS_INS_LWC2 = 355
    const val MIPS_INS_LWC3 = 356
    const val MIPS_INS_LWL = 357
    const val MIPS_INS_LWPC = 358
    const val MIPS_INS_LWR = 359
    const val MIPS_INS_LWUPC = 360
    const val MIPS_INS_LWU = 361
    const val MIPS_INS_LWX = 362
    const val MIPS_INS_LWXC1 = 363
    const val MIPS_INS_LI = 364
    const val MIPS_INS_MADD = 365
    const val MIPS_INS_MADDF = 366
    const val MIPS_INS_MADDR_Q = 367
    const val MIPS_INS_MADDU = 368
    const val MIPS_INS_MADDV = 369
    const val MIPS_INS_MADD_Q = 370
    const val MIPS_INS_MAQ_SA = 371
    const val MIPS_INS_MAQ_S = 372
    const val MIPS_INS_MAXA = 373
    const val MIPS_INS_MAXI_S = 374
    const val MIPS_INS_MAXI_U = 375
    const val MIPS_INS_MAX_A = 376
    const val MIPS_INS_MAX = 377
    const val MIPS_INS_MAX_S = 378
    const val MIPS_INS_MAX_U = 379
    const val MIPS_INS_MFC0 = 380
    const val MIPS_INS_MFC1 = 381
    const val MIPS_INS_MFC2 = 382
    const val MIPS_INS_MFHC1 = 383
    const val MIPS_INS_MFHI = 384
    const val MIPS_INS_MFLO = 385
    const val MIPS_INS_MINA = 386
    const val MIPS_INS_MINI_S = 387
    const val MIPS_INS_MINI_U = 388
    const val MIPS_INS_MIN_A = 389
    const val MIPS_INS_MIN = 390
    const val MIPS_INS_MIN_S = 391
    const val MIPS_INS_MIN_U = 392
    const val MIPS_INS_MOD = 393
    const val MIPS_INS_MODSUB = 394
    const val MIPS_INS_MODU = 395
    const val MIPS_INS_MOD_S = 396
    const val MIPS_INS_MOD_U = 397
    const val MIPS_INS_MOVE = 398
    const val MIPS_INS_MOVF = 399
    const val MIPS_INS_MOVN = 400
    const val MIPS_INS_MOVT = 401
    const val MIPS_INS_MOVZ = 402
    const val MIPS_INS_MSUB = 403
    const val MIPS_INS_MSUBF = 404
    const val MIPS_INS_MSUBR_Q = 405
    const val MIPS_INS_MSUBU = 406
    const val MIPS_INS_MSUBV = 407
    const val MIPS_INS_MSUB_Q = 408
    const val MIPS_INS_MTC0 = 409
    const val MIPS_INS_MTC1 = 410
    const val MIPS_INS_MTC2 = 411
    const val MIPS_INS_MTHC1 = 412
    const val MIPS_INS_MTHI = 413
    const val MIPS_INS_MTHLIP = 414
    const val MIPS_INS_MTLO = 415
    const val MIPS_INS_MTM0 = 416
    const val MIPS_INS_MTM1 = 417
    const val MIPS_INS_MTM2 = 418
    const val MIPS_INS_MTP0 = 419
    const val MIPS_INS_MTP1 = 420
    const val MIPS_INS_MTP2 = 421
    const val MIPS_INS_MUH = 422
    const val MIPS_INS_MUHU = 423
    const val MIPS_INS_MULEQ_S = 424
    const val MIPS_INS_MULEU_S = 425
    const val MIPS_INS_MULQ_RS = 426
    const val MIPS_INS_MULQ_S = 427
    const val MIPS_INS_MULR_Q = 428
    const val MIPS_INS_MULSAQ_S = 429
    const val MIPS_INS_MULSA = 430
    const val MIPS_INS_MULT = 431
    const val MIPS_INS_MULTU = 432
    const val MIPS_INS_MULU = 433
    const val MIPS_INS_MULV = 434
    const val MIPS_INS_MUL_Q = 435
    const val MIPS_INS_MUL_S = 436
    const val MIPS_INS_NLOC = 437
    const val MIPS_INS_NLZC = 438
    const val MIPS_INS_NMADD = 439
    const val MIPS_INS_NMSUB = 440
    const val MIPS_INS_NOR = 441
    const val MIPS_INS_NORI = 442
    const val MIPS_INS_NOT = 443
    const val MIPS_INS_OR = 444
    const val MIPS_INS_ORI = 445
    const val MIPS_INS_PACKRL = 446
    const val MIPS_INS_PAUSE = 447
    const val MIPS_INS_PCKEV = 448
    const val MIPS_INS_PCKOD = 449
    const val MIPS_INS_PCNT = 450
    const val MIPS_INS_PICK = 451
    const val MIPS_INS_POP = 452
    const val MIPS_INS_PRECEQU = 453
    const val MIPS_INS_PRECEQ = 454
    const val MIPS_INS_PRECEU = 455
    const val MIPS_INS_PRECRQU_S = 456
    const val MIPS_INS_PRECRQ = 457
    const val MIPS_INS_PRECRQ_RS = 458
    const val MIPS_INS_PRECR = 459
    const val MIPS_INS_PRECR_SRA = 460
    const val MIPS_INS_PRECR_SRA_R = 461
    const val MIPS_INS_PREF = 462
    const val MIPS_INS_PREPEND = 463
    const val MIPS_INS_RADDU = 464
    const val MIPS_INS_RDDSP = 465
    const val MIPS_INS_RDHWR = 466
    const val MIPS_INS_REPLV = 467
    const val MIPS_INS_REPL = 468
    const val MIPS_INS_RINT = 469
    const val MIPS_INS_ROTR = 470
    const val MIPS_INS_ROTRV = 471
    const val MIPS_INS_ROUND = 472
    const val MIPS_INS_SAT_S = 473
    const val MIPS_INS_SAT_U = 474
    const val MIPS_INS_SB = 475
    const val MIPS_INS_SC = 476
    const val MIPS_INS_SCD = 477
    const val MIPS_INS_SD = 478
    const val MIPS_INS_SDBBP = 479
    const val MIPS_INS_SDC1 = 480
    const val MIPS_INS_SDC2 = 481
    const val MIPS_INS_SDC3 = 482
    const val MIPS_INS_SDL = 483
    const val MIPS_INS_SDR = 484
    const val MIPS_INS_SDXC1 = 485
    const val MIPS_INS_SEB = 486
    const val MIPS_INS_SEH = 487
    const val MIPS_INS_SELEQZ = 488
    const val MIPS_INS_SELNEZ = 489
    const val MIPS_INS_SEL = 490
    const val MIPS_INS_SEQ = 491
    const val MIPS_INS_SEQI = 492
    const val MIPS_INS_SH = 493
    const val MIPS_INS_SHF = 494
    const val MIPS_INS_SHILO = 495
    const val MIPS_INS_SHILOV = 496
    const val MIPS_INS_SHLLV = 497
    const val MIPS_INS_SHLLV_S = 498
    const val MIPS_INS_SHLL = 499
    const val MIPS_INS_SHLL_S = 500
    const val MIPS_INS_SHRAV = 501
    const val MIPS_INS_SHRAV_R = 502
    const val MIPS_INS_SHRA = 503
    const val MIPS_INS_SHRA_R = 504
    const val MIPS_INS_SHRLV = 505
    const val MIPS_INS_SHRL = 506
    const val MIPS_INS_SLDI = 507
    const val MIPS_INS_SLD = 508
    const val MIPS_INS_SLL = 509
    const val MIPS_INS_SLLI = 510
    const val MIPS_INS_SLLV = 511
    const val MIPS_INS_SLT = 512
    const val MIPS_INS_SLTI = 513
    const val MIPS_INS_SLTIU = 514
    const val MIPS_INS_SLTU = 515
    const val MIPS_INS_SNE = 516
    const val MIPS_INS_SNEI = 517
    const val MIPS_INS_SPLATI = 518
    const val MIPS_INS_SPLAT = 519
    const val MIPS_INS_SRA = 520
    const val MIPS_INS_SRAI = 521
    const val MIPS_INS_SRARI = 522
    const val MIPS_INS_SRAR = 523
    const val MIPS_INS_SRAV = 524
    const val MIPS_INS_SRL = 525
    const val MIPS_INS_SRLI = 526
    const val MIPS_INS_SRLRI = 527
    const val MIPS_INS_SRLR = 528
    const val MIPS_INS_SRLV = 529
    const val MIPS_INS_SSNOP = 530
    const val MIPS_INS_ST = 531
    const val MIPS_INS_SUBQH = 532
    const val MIPS_INS_SUBQH_R = 533
    const val MIPS_INS_SUBQ = 534
    const val MIPS_INS_SUBQ_S = 535
    const val MIPS_INS_SUBSUS_U = 536
    const val MIPS_INS_SUBSUU_S = 537
    const val MIPS_INS_SUBS_S = 538
    const val MIPS_INS_SUBS_U = 539
    const val MIPS_INS_SUBUH = 540
    const val MIPS_INS_SUBUH_R = 541
    const val MIPS_INS_SUBU = 542
    const val MIPS_INS_SUBU_S = 543
    const val MIPS_INS_SUBVI = 544
    const val MIPS_INS_SUBV = 545
    const val MIPS_INS_SUXC1 = 546
    const val MIPS_INS_SW = 547
    const val MIPS_INS_SWC1 = 548
    const val MIPS_INS_SWC2 = 549
    const val MIPS_INS_SWC3 = 550
    const val MIPS_INS_SWL = 551
    const val MIPS_INS_SWR = 552
    const val MIPS_INS_SWXC1 = 553
    const val MIPS_INS_SYNC = 554
    const val MIPS_INS_SYSCALL = 555
    const val MIPS_INS_TEQ = 556
    const val MIPS_INS_TEQI = 557
    const val MIPS_INS_TGE = 558
    const val MIPS_INS_TGEI = 559
    const val MIPS_INS_TGEIU = 560
    const val MIPS_INS_TGEU = 561
    const val MIPS_INS_TLBP = 562
    const val MIPS_INS_TLBR = 563
    const val MIPS_INS_TLBWI = 564
    const val MIPS_INS_TLBWR = 565
    const val MIPS_INS_TLT = 566
    const val MIPS_INS_TLTI = 567
    const val MIPS_INS_TLTIU = 568
    const val MIPS_INS_TLTU = 569
    const val MIPS_INS_TNE = 570
    const val MIPS_INS_TNEI = 571
    const val MIPS_INS_TRUNC = 572
    const val MIPS_INS_V3MULU = 573
    const val MIPS_INS_VMM0 = 574
    const val MIPS_INS_VMULU = 575
    const val MIPS_INS_VSHF = 576
    const val MIPS_INS_WAIT = 577
    const val MIPS_INS_WRDSP = 578
    const val MIPS_INS_WSBH = 579
    const val MIPS_INS_XOR = 580
    const val MIPS_INS_XORI = 581

    // some alias instructions
    const val MIPS_INS_NOP = 582
    const val MIPS_INS_NEGU = 583

    // special instructions
    const val MIPS_INS_JALR_HB = 584
    const val MIPS_INS_JR_HB = 585
    const val MIPS_INS_ENDING = 586

    // Group of MIPS instructions
    const val MIPS_GRP_INVALID = 0

    // Generic groups
    const val MIPS_GRP_JUMP = 1

    // Architecture-specific groups
    const val MIPS_GRP_BITCOUNT = 128
    const val MIPS_GRP_DSP = 129
    const val MIPS_GRP_DSPR2 = 130
    const val MIPS_GRP_FPIDX = 131
    const val MIPS_GRP_MSA = 132
    const val MIPS_GRP_MIPS32R2 = 133
    const val MIPS_GRP_MIPS64 = 134
    const val MIPS_GRP_MIPS64R2 = 135
    const val MIPS_GRP_SEINREG = 136
    const val MIPS_GRP_STDENC = 137
    const val MIPS_GRP_SWAP = 138
    const val MIPS_GRP_MICROMIPS = 139
    const val MIPS_GRP_MIPS16MODE = 140
    const val MIPS_GRP_FP64BIT = 141
    const val MIPS_GRP_NONANSFPMATH = 142
    const val MIPS_GRP_NOTFP64BIT = 143
    const val MIPS_GRP_NOTINMICROMIPS = 144
    const val MIPS_GRP_NOTNACL = 145
    const val MIPS_GRP_NOTMIPS32R6 = 146
    const val MIPS_GRP_NOTMIPS64R6 = 147
    const val MIPS_GRP_CNMIPS = 148
    const val MIPS_GRP_MIPS32 = 149
    const val MIPS_GRP_MIPS32R6 = 150
    const val MIPS_GRP_MIPS64R6 = 151
    const val MIPS_GRP_MIPS2 = 152
    const val MIPS_GRP_MIPS3 = 153
    const val MIPS_GRP_MIPS3_32 = 154
    const val MIPS_GRP_MIPS3_32R2 = 155
    const val MIPS_GRP_MIPS4_32 = 156
    const val MIPS_GRP_MIPS4_32R2 = 157
    const val MIPS_GRP_MIPS5_32R2 = 158
    const val MIPS_GRP_GP32BIT = 159
    const val MIPS_GRP_GP64BIT = 160
    const val MIPS_GRP_ENDING = 161
}