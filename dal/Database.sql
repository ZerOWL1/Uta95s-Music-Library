USE [SE1435_PRJ321]
GO
/****** Object:  Table [dbo].[HE141223_HAILD_ALBUM]    Script Date: 3/24/2021 12:08:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141223_HAILD_ALBUM](
	[idAlbum] [nvarchar](255) NOT NULL,
	[idArtist] [nvarchar](255) NULL,
	[Name] [nvarchar](255) NULL,
	[Year] [nvarchar](255) NULL,
	[AImg_path] [nvarchar](max) NULL,
	[DATE_UPDATE] [date] NULL,
	[idGenre] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[idAlbum] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HE141223_HAILD_ARTIST]    Script Date: 3/24/2021 12:08:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141223_HAILD_ARTIST](
	[idArtist] [nvarchar](255) NOT NULL,
	[Name] [nvarchar](255) NULL,
	[Band] [nvarchar](255) NULL,
	[SpellName] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[idArtist] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HE141223_HAILD_FAVORITES]    Script Date: 3/24/2021 12:08:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141223_HAILD_FAVORITES](
	[UID] [int] NULL,
	[SongID] [int] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HE141223_HAILD_GENRE]    Script Date: 3/24/2021 12:08:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141223_HAILD_GENRE](
	[idGenre] [int] NOT NULL,
	[Name] [nvarchar](255) NULL,
 CONSTRAINT [PK__HE141223__C58C0676FD4C43FD] PRIMARY KEY CLUSTERED 
(
	[idGenre] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HE141223_HAILD_SONG]    Script Date: 3/24/2021 12:08:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141223_HAILD_SONG](
	[SongID] [int] NOT NULL,
	[Name] [nvarchar](max) NULL,
	[Release] [nvarchar](255) NULL,
	[idAlbum] [nvarchar](255) NULL,
	[idArtist] [nvarchar](255) NULL,
	[idGenre] [int] NULL,
	[MV_path] [nvarchar](max) NULL,
	[Song_path] [nvarchar](max) NULL,
	[Img_path] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[SongID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HE141223_HAILD_USER]    Script Date: 3/24/2021 12:08:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141223_HAILD_USER](
	[UID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](255) NULL,
	[Password] [nvarchar](255) NULL,
	[isAdmin] [int] NULL CONSTRAINT [DF__HE141223___isAdm__1920BF5C]  DEFAULT ((0)),
	[isUser] [int] NULL CONSTRAINT [DF__HE141223___isUse__1A14E395]  DEFAULT ((1)),
	[Mail] [nvarchar](255) NULL,
	[UImg_path] [nvarchar](max) NULL,
 CONSTRAINT [PK__HE141223__C5B196025BB79E0D] PRIMARY KEY CLUSTERED 
(
	[UID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HE141223_HAILD_VIEW]    Script Date: 3/24/2021 12:08:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141223_HAILD_VIEW](
	[VIEWED] [int] NULL
) ON [PRIMARY]

GO
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'AKARI2014', N'AMAM1993', N'Tsuki Akari', N'2014', N'https://i.ibb.co/hK1659B/cover.jpg', CAST(N'2021-02-15' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'AMA2018', N'AMAT1991', N'Sore wa Kitto Koideshita', N'2018', N'https://i.ibb.co/DK99bGc/image.jpg', CAST(N'2021-02-16' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'ANAM2012', N'ANNA2005', N'anamnesis', N'2012', N'https://i.ibb.co/BP7K1bS/cover.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'AOKA2016', N'KAWA1980', N'Contrail ~Kiseki~', N'2016', N'https://i.ibb.co/vkps4bZ/cover-01.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'CHi2018', N'CHIC2010', N'Watashi wo Someru I no Uta', N'2018', N'https://i.ibb.co/wryGZb3/cover1.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'CIRC2013', N'GALI2007', N'Circle Game', N'2013', N'https://i.ibb.co/zXZdj4p/Cover.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'DENS2012', N'ALIP2007', N'Kyoumu Densen [Limited Edition]', N'2012', N'https://i.ibb.co/ysqhKBy/cover.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'HELLO2015', N'MOUM2005', N'Hello,shooting-star', N'2015', N'https://i.ibb.co/JRNG7DC/Cover1.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'HERO2017', N'MISS2010', N'My Hero/Find You - EP', N'2017', N'https://i.ibb.co/pQXxwvK/Cover2.jpg', CAST(N'2021-02-14' AS Date), 2)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'HUMM2020', N'ENCO1997', N'Humming Bird', N'2020', N'https://i.ibb.co/PTFdR5L/cover.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'IJIN2019', N'KUSU1999', N'Ijintachi no Jikan', N'2019', N'https://i.ibb.co/F7vkC4y/cover.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'JUMP2011', N'LSPL2010', N'Kimi + Nazo + Watashi de JUMP!!', N'2011', N'https://i.ibb.co/x8zJzYy/3e3264c6f8d545c9945457127831ed45.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'MSYB2010', N'LIA1981', N'My Soul, Your Beats!', N'2010', N'https://i.ibb.co/QJmnww7/Cover.png', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'ODORE2017', N'UESA1991', N'Odore! Kyuukyoku Tetsugaku', N'2017', N'https://i.ibb.co/L5g8NRx/Cover.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'PERF2010', N'NATS1990', N'Perfect Area Complete!', N'2010', N'https://i.ibb.co/NT9YhY8/01.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'REA2020', N'KONO1996', N'Realize', N'2020', N'https://i.ibb.co/PCRnQ5w/cover-re-zero.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'REBIR2020', N'ACID1997', N'Rebirth', N'2020', N'https://i.ibb.co/ypTSXYM/COVER.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'RERE2016', N'KUFU1996', N'Re:Re: - Single', N'2016', N'https://i.ibb.co/TrgPy4M/Shi-No-Kakaku-Shi-no-kakaku-2-blogspot-mx.jpg', CAST(N'2021-02-18' AS Date), 2)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'SHAR2019', N'RUNG2017', N'Share the light', N'2019', N'https://i.ibb.co/NZnK0df/COVER.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'SHBA2020', N'RYOU2012', N'Shout Baby', N'2020', N'https://i.ibb.co/dMnT6kq/cover.jpg', CAST(N'2021-02-18' AS Date), 3)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'SHLE2018', N'TOKY2013', N'Shapeless', N'2018', N'https://i.ibb.co/L5kLdvH/cover.jpg', CAST(N'2021-02-18' AS Date), 3)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'SUK2021', N'EITO1997', N'Sukkarakan', N'2021', N'https://i.ibb.co/4ZyJ5c0/cover.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'SURIP2018', N'VARIOSART', N'スリピス', N'2018', N'https://i.ibb.co/9HfNW1K/cover.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'TBIR2016', N'MAMO1983', N'The Birth', N'2016', N'https://i.ibb.co/s2Nrr0s/Cover.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'TONARI2013_ST', N'GARD2004', N'Tonari no Kaibutsukun Soundtrack CD', N'2013', N'https://i.ibb.co/1M5XhSM/Cover.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'WILD2019', N'ALI2016', N'Wild Side - EP', N'2019', N'https://i.ibb.co/1qkQXkX/cover.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ALBUM] ([idAlbum], [idArtist], [Name], [Year], [AImg_path], [DATE_UPDATE], [idGenre]) VALUES (N'WIRED2014', N'FUJI2000', N'ブルー/WIRED', N'2014', N'https://i.ibb.co/y032Sqs/hikarinoakariost-info.jpg', CAST(N'2021-02-14' AS Date), 1)
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'ABING2005', N'Abingdon Boys School', N'Abingdon Boys School', N'Abingdon Boys School')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'ACID1997', N'ACIDMAN', N'ACIDMAN', N'ACIDMAN')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'AKI1988', N'Aki Deguchi', N'SKE48', N'出口 陽')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'ALI2016', N'ALI', N'ALI', N'ALI')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'ALIP2007', N'Ali Project', N'Ali Project', N'Ali Project')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'AMAM1993', N'Sora Amamiya', N'', N'雨宮 天')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'AMAT1991', N'Amatsuki', NULL, N'天月')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'AMAZA2007', N'Amazarashi', N'Amazarashi', N'amazarashi')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'ANNA2005', N'Annabel', N'', N'Annabel')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'AOI1981', N'Tada Aoi', N'', N'多田 葵')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'AOI1983', N'Aoi Shouta', N'', N'蒼井翔太')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'ARISA1991', N'Arisa Takigawa', N'', N'瀧川 ありさ')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'ASUKA1987', N'Asuka Ōgame', N'', N'大亀 あすか')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'AYAKA1994', N'Ayaka Ōhashi', N'', N'大橋 彩香')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'AYANA1989', N'Ayana Taketatsu', N'', N'竹達 彩奈')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'AYANO2014', N'Ayano Mashiro', N'', N'綾野 ましろ')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'AYUMI1971', N'Ayumi Miyazaki', N'', N'宮崎 歩')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'BEE2009', N'Queen Bee', N'Queen Bee', N'女王蜂')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'BINA2007', N'binaria', N'binaria', N'binaria')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'BRAD2010', N'Bradio', N'BRADIO', N'ブラディオ')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'BRDE2010', N'Black Raison dêtre', N'Black Raison dêtre', N'Black Raison dêtre')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'CHIC2010', N'CHiCO', N'HoneyWorks', N'CHiCO')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'CLAR2009', N'ClariS', N'ClariS', N'ClariS')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'COOR2001', N'CooRie', N'', N'CooRie')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'EITO1997', N'Eito', NULL, N'瑛人')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'ENCO1997', N'BLUE ENCOUNT', N'BLUE ENCOUNT', N'ブルー・エンカウント')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'ETSU2006', N'Etsuko Yakushimaru', N'', N'やくしまる えつこ')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'EUFO2003', N'Eufonius', N'Eufonius', N'Eufonius')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'EVE1995', N'Eve', N'', N'Eve')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'FHANA2012', N'fhána', N'fhána', N'fhána')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'FLOW1998', N'Flow', N'Flow', N'FLOW')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'FOX2013', N'Fo"xTails', N'Fo"xTails', N'Fo"xTails')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'FRIP2002', N'fripSide', N'fripSide', N'fripSide')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'FUJI2000', N'Fujifabric', N'Fujifabric', N'Fujifabric')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'GALI2007', N'Galileo Galilei', N'Galileo Galilei', N'ガリレオ・ガリレイ')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'GARD2004', N'Elements Garden', N'Elements Garden', N'中山真斗')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'GRAN2005', N'Granrodeo', N'Granrodeo', N'GRANRODEO')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'HACHI2014', N'Hachimitsu Rocket', N'Hachimitsu Rocket', N'はちみつロケット')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'HARA1988', N'Hara Sayuri', N'', N'原紗友里')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'HOWL2013', N'HOWL BE QUIET', N'HOWL BE QUIET', N'オフィシャルサイト')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'KANA1973', N'Itō Kanako', N'', N'いとうかなこ')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'KANA1989', N'Kana Hanazawa', N'', N'花澤香菜')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'KAWA1980', N'Mami Kawada', N'', N'川田 まみ')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'KOJI1974', N'Kōji Wada', N'', N'和田 光司')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'KONO1996', N'Konomi Suzuki', N'', N'鈴木このみ')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'KUFU1996', N'Asian Kung-Fu Generation', N'Asian Kung-Fu Generation', N'Asian Kung-Fu Generation')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'KUSU1999', N'Tomori Kusunoki', N'', N'楠木 ともり')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'LENY2012', N'Lenny code fiction', N'Lenny code fiction', N'Lenny code fiction')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'LIA1981', N'Lia', N'', N'りあ')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'LIVE2007', N'Livetune', N'Livetune', N'Livetune')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'LSPL2010', N'Larval Stage Planning', N'Larval Stage Planning', N'ラーバル　ステージ　プランニング')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'LUCK2008', N'Luck Life', N'Luck Life', N'ラックライフ')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'MAMO1983', N'Miyano Mamoru', N'', N'宮野 真守')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'MANA1988', N'Manami Numakura', N'', N'沼倉愛美')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'MAON2010', N'Maon Kurosaki', N'', N'黒崎 真音')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'MAYU1995', N'Mayu Yoshioka', N'Wake Up, Girls!', N'吉岡茉祐')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'MEGU1965', N'Megumi Ogata', N'', N'緒方 恵美')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'MIAR2016', N'Mia REGINA', N'Mia REGINA', N'Mia REGINA')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'MICHI1996', N'Michiko Tōyama', N'', N'當山美智子')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'MIKA1983', N'Mika Nakashima ', N'', N'中島美嘉')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'MINAMI1997', N'Minami', N'', N'美波')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'MISS2010', N'Man with a Mission', N'Man with a Mission', N'Man with a Mission')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'MIYU1980', N'Miyuki Hashimoto', N'', N'橋本みゆき')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'MOUM2005', N'Moumoon', N'Moumoon', N'Moumoon')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'NAKA2005', N'Nakae Mitsuki', N'', N'中恵 光城')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'NAME2016', N'(K)NoW_NAME', N'(K)NoW_NAME', N'ノウネイム')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'NANA1980', N'Nana Mizuki', N'', N'水樹 奈々')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'NANO1988', N'NANO', N'', N'ナノ')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'NANO1998', N'Nano Ripe', N'Nano Ripe', N'nano.RIPE')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'NAO1992', N'Nao Tōyama', N'', N'東山 奈央')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'NATS1990', N'Aso Natsuko', N'', N'麻生 夏子')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'NIGHT2010', N'Nightmare', N'Nightmare', N'ナイトメア')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'NOISE2007', N'NoisyCell', N'NoisyCell', N'NoisyCell')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'OISHI1980', N'Oishi Masayoshi', N'', N'大石昌良')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'PHERO2009', N'Phero☆Men', N'Phero☆Men', N'フェロ☆メン')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'QYOTO2016', N'Qyoto', N'Qyoto', N'Qyoto')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'RADIO2007', N'99RadioService', N'99RadioService', N'ナインナイン')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'RAIN2014', N'After the Rain', N'After the Rain', N'そらいろまふら')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'RIDER2005', N'Song Riders', N'Song Riders', N'Song Riders')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'RUNG2017', N'Run Girls, Run!', N'Run Girls, Run!', N'Run Girls, Run!')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'RYOU2012', N'RYOKUOUSHOKU SHAKAI', N'RYOKUOUSHOKU SHAKAI', N'緑黄色社会')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'RYUTA1982', N'Iida Ryuta', N'', N'STEREO DIVE FOUNDATION, 飯田龍太')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'SAJOU2018', N'sajou no hana', N'sajou no hana', N'sajou no hana')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'SANG2015', N'Sangatsu no Phantasia', N'', N'三月のパンタシア')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'SARM2012', N'sweet ARMS', N'sweet ARMS', N'sweet ARMS')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'SAYA1982', N'Sayaka Sasaki', N'', N'佐咲 紗花')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'SCRE2013', N'SCREEN mode', N'SCREEN mode', N'スクリーンモード')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'TOKY2013', N'Tokyo Performance Doll', N'Tokyo Performance Doll', N'東京パフォーマンスドール')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'TRUS2014', N'TRUSTRICK', N'TRUSTRICK', N'TRUSTRICK')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'TRYS2015', N'TrySail', N'TrySail', N'TrySail')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'UESA1991', N'Sumire Uesaka', N'', N'上坂すみれ')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'VARIOSART', N'Various Artists', N'', N'')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'WAKE2013', N'Wake Up, Girls!', N'Wake Up, Girls!', N'Wake Up, Girls!')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'YAMA1971', N'Yamazaki Masayoshi', N'', N'山崎 まさよし')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'YUI1976', N'Yui Horie', N'', N'堀江 由衣')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'YUI1980', N'Yui Sakakibara', N'', N'榊原 ゆい')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'YUKA1988', N'Yuka Iguchi', N'', N'井口 裕香')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'YURi1995', N'YURiKA', N'', N'小林友里花')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'YUTA1995', N'Yuta Hashimoto', N'', N'橋本裕太')
INSERT [dbo].[HE141223_HAILD_ARTIST] ([idArtist], [Name], [Band], [SpellName]) VALUES (N'ZAQ1988', N'ZAQ', N'', N'ZAQ')
GO
INSERT [dbo].[HE141223_HAILD_FAVORITES] ([UID], [SongID]) VALUES (1, 16)
INSERT [dbo].[HE141223_HAILD_FAVORITES] ([UID], [SongID]) VALUES (18, 16)
INSERT [dbo].[HE141223_HAILD_FAVORITES] ([UID], [SongID]) VALUES (7, 9)
INSERT [dbo].[HE141223_HAILD_FAVORITES] ([UID], [SongID]) VALUES (1, 2)
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (1, N'J-Pop')
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (2, N'J-Rock')
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (3, N'Anime')
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (4, N'Hip-Hop')
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (5, N'J-Music')
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (7, N'Film')
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (8, N'Miscellaneous')
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (9, N'Indie')
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (10, N'Downtempo')
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (11, N'Game')
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (12, N'World Pop')
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (13, N'C-Pop')
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (14, N'R&B')
INSERT [dbo].[HE141223_HAILD_GENRE] ([idGenre], [Name]) VALUES (15, N'Electro Pop')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (1, N'Watashi wo Someru I no Uta', N'2018', N'CHi2018', N'CHIC2010', 1, N'https://youtu.be/m7ddbml_vkY', N'https://media1.vocaroo.com/mp3/1oicf0t2zmLU', N'https://i.ibb.co/wryGZb3/cover1.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (2, N'Tsuinzu', N'2018', N'CHi2018', N'CHIC2010', 1, N'https://youtu.be/_kZnvhKNY_E', N'https://media1.vocaroo.com/mp3/1nJcK0F8w9Tz', N'https://i.ibb.co/JmZZ5vS/cover2.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (3, N'Perfume', N'2019', N'SUK2021', N'EITO1997', 1, N'https://youtu.be/9MjAJSoaoSo', N'https://media1.vocaroo.com/mp3/16c3bY7BgkXb', N'https://i.ibb.co/4ZyJ5c0/cover.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (4, N'Getsuyōbi no yūutsu', N'2018', N'AMA2018', N'AMAT1991', 1, N'https://youtu.be/E5Jy_h1eHzY', N'https://media1.vocaroo.com/mp3/11RVV8RUZaqf', N'https://i.ibb.co/DK99bGc/image.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (5, N'BLUE ENCOUNT', N'2020', N'HUMM2020', N'ABING2005', 1, N'', N'https://media1.vocaroo.com/mp3/1o2yh9bHfwBN', N'https://i.ibb.co/PTFdR5L/cover.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (6, N'Rebirth', N'2020', N'REBIR2020', N'ACID1997', 1, N'', N'https://media1.vocaroo.com/mp3/15wowTZn5mS8', N'https://i.ibb.co/ypTSXYM/COVER.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (7, N'Odore! Kyuukyoku Tetsugaku', N'2017', N'ODORE2017', N'UESA1991', 1, N'', N'https://media1.vocaroo.com/mp3/183LiO6bXmlh', N'https://i.ibb.co/L5g8NRx/Cover.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (8, N'01. The Birth', N'2016', N'TBIR2016', N'MAMO1983', 1, N'', N'https://media1.vocaroo.com/mp3/16MTSzorvcna', N'https://i.ibb.co/s2Nrr0s/Cover.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (9, N'02. Gravity', N'2016', N'TBIR2016', N'MAMO1983', 1, N'', N'https://media1.vocaroo.com/mp3/1ncexYAPOLQs', N'https://i.ibb.co/s2Nrr0s/Cover.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (10, N'Tsuki Akari', N'2014', N'AKARI2014', N'AMAM1993', 1, N'', N'https://media1.vocaroo.com/mp3/14hk4jIgsZit', N'https://i.ibb.co/hK1659B/cover.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (11, N'01 - My Soul, Your Beats!', N'2010', N'MSYB2010', N'LIA1981', 1, N'', N'https://media1.vocaroo.com/mp3/125WZAE9MUyA', N'https://i.ibb.co/QJmnww7/Cover.png')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (12, N'02 - Brave Song', N'2010', N'MSYB2010', N'AOI1981', 1, N'', N'https://media1.vocaroo.com/mp3/13ZSob2uatnS', N'https://i.ibb.co/QJmnww7/Cover.png')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (13, N'Circle Game', N'2013', N'CIRC2013', N'GALI2007', 1, N'', N'https://media1.vocaroo.com/mp3/11HMa4Hv8fiW', N'https://i.ibb.co/zXZdj4p/Cover.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (14, N'01 - Kyoumu Densen', N'2012', N'DENS2012', N'ALIP2007', 3, N'', N'https://media1.vocaroo.com/mp3/154RqwSlnMrQ', N'https://i.ibb.co/ysqhKBy/cover.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (15, N'01 - anamnesis', N'2012', N'ANAM2012', N'ANNA2005', 3, N'', N'https://media1.vocaroo.com/mp3/1aYv294wHwZ0', N'https://i.ibb.co/BP7K1bS/cover.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (16, N'01. Hello,shooting-star', N'2015', N'HELLO2015', N'MOUM2005', 3, N'', N'https://media1.vocaroo.com/mp3/1mHSxcZKFFAJ', N'https://i.ibb.co/JRNG7DC/Cover1.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (17, N'02. WIRED', N'2014', N'WIRED2014', N'FUJI2000', 1, N'', N'https://media1.vocaroo.com/mp3/18QAJWgM8gRO', N'https://i.ibb.co/y032Sqs/hikarinoakariost-info.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (18, N'01. Contrail ~Kiseki~', N'2016', N'AOKA2016', N'KAWA1980', 3, N'', N'https://media1.vocaroo.com/mp3/1aY1HoM8FQJd', N'https://i.ibb.co/vkps4bZ/cover-01.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (19, N'Supirisu', N'2018', N'SURIP2018', N'VARIOSART', 3, N'', N'https://media1.vocaroo.com/mp3/167r2OioqGMu', N'https://i.ibb.co/9HfNW1K/cover.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (20, N'01.Share the light', N'2019', N'SHAR2019', N'RUNG2017', 3, N'', N'https://media1.vocaroo.com/mp3/1rDh0QQNTZ4i', N'https://i.ibb.co/NZnK0df/COVER.jpg')
INSERT [dbo].[HE141223_HAILD_SONG] ([SongID], [Name], [Release], [idAlbum], [idArtist], [idGenre], [MV_path], [Song_path], [Img_path]) VALUES (21, N'Ijintachi no Jikan', N'2019', N'IJIN2019', N'KUSU1999', 3, N'', N'https://media1.vocaroo.com/mp3/1kUI9IMacMa9', N'https://i.ibb.co/F7vkC4y/cover.jpg')
SET IDENTITY_INSERT [dbo].[HE141223_HAILD_USER] ON 

INSERT [dbo].[HE141223_HAILD_USER] ([UID], [Name], [Password], [isAdmin], [isUser], [Mail], [UImg_path]) VALUES (1, N'Lu Chai', N'123478kid', 1, 1, N'databaser2000kid@gmail.com', N'https://i.ytimg.com/vi/kzdJkT4kp-A/maxresdefault.jpg')
INSERT [dbo].[HE141223_HAILD_USER] ([UID], [Name], [Password], [isAdmin], [isUser], [Mail], [UImg_path]) VALUES (7, N'Hello', N'123478', 0, 1, N'luchai2000kid@gmail.com', N'https://i.ytimg.com/vi/kzdJkT4kp-A/maxresdefault.jpg')
INSERT [dbo].[HE141223_HAILD_USER] ([UID], [Name], [Password], [isAdmin], [isUser], [Mail], [UImg_path]) VALUES (8, N'Lu Chai', N'123456', 0, 1, N'luchai2000fatps@gmail.com', NULL)
INSERT [dbo].[HE141223_HAILD_USER] ([UID], [Name], [Password], [isAdmin], [isUser], [Mail], [UImg_path]) VALUES (10, N'J-PHONEBOT', N'jphonechan1999', 1, 0, N'jphonebot@gmail.com', NULL)
INSERT [dbo].[HE141223_HAILD_USER] ([UID], [Name], [Password], [isAdmin], [isUser], [Mail], [UImg_path]) VALUES (11, N'Hello', N'123456', 0, 1, N'haildhe141223@fpt.edu.vn', N'')
INSERT [dbo].[HE141223_HAILD_USER] ([UID], [Name], [Password], [isAdmin], [isUser], [Mail], [UImg_path]) VALUES (12, N'Phuong', N'123478', 1, 0, N'phuongnl2000@gmail.com', N'https://www.imgworlds.com/wp-content/uploads/2015/12/18-CONTACTUS-HEADER.jpg')
INSERT [dbo].[HE141223_HAILD_USER] ([UID], [Name], [Password], [isAdmin], [isUser], [Mail], [UImg_path]) VALUES (13, N'', N'abc123', 0, 1, N'abc@gmail.com', N'')
INSERT [dbo].[HE141223_HAILD_USER] ([UID], [Name], [Password], [isAdmin], [isUser], [Mail], [UImg_path]) VALUES (14, N'', N'123478kid', 0, 1, N'hello@gmail.com', N'')
INSERT [dbo].[HE141223_HAILD_USER] ([UID], [Name], [Password], [isAdmin], [isUser], [Mail], [UImg_path]) VALUES (15, N'', N'123456789', 0, 1, N'phuongnl@gmail.com', N'')
INSERT [dbo].[HE141223_HAILD_USER] ([UID], [Name], [Password], [isAdmin], [isUser], [Mail], [UImg_path]) VALUES (16, N'', N'123456789', 0, 1, N'phuongnl1999@gmail.com', N'')
INSERT [dbo].[HE141223_HAILD_USER] ([UID], [Name], [Password], [isAdmin], [isUser], [Mail], [UImg_path]) VALUES (18, N'LuChai123478', N'123478kid', 0, 1, N'luchai123478@gmail.com', N'')
SET IDENTITY_INSERT [dbo].[HE141223_HAILD_USER] OFF
INSERT [dbo].[HE141223_HAILD_VIEW] ([VIEWED]) VALUES (70)
ALTER TABLE [dbo].[HE141223_HAILD_ALBUM]  WITH CHECK ADD FOREIGN KEY([idArtist])
REFERENCES [dbo].[HE141223_HAILD_ARTIST] ([idArtist])
GO
ALTER TABLE [dbo].[HE141223_HAILD_ALBUM]  WITH CHECK ADD  CONSTRAINT [FK__HE141223___idGen__239E4DCF] FOREIGN KEY([idGenre])
REFERENCES [dbo].[HE141223_HAILD_GENRE] ([idGenre])
GO
ALTER TABLE [dbo].[HE141223_HAILD_ALBUM] CHECK CONSTRAINT [FK__HE141223___idGen__239E4DCF]
GO
ALTER TABLE [dbo].[HE141223_HAILD_FAVORITES]  WITH CHECK ADD FOREIGN KEY([SongID])
REFERENCES [dbo].[HE141223_HAILD_SONG] ([SongID])
GO
ALTER TABLE [dbo].[HE141223_HAILD_FAVORITES]  WITH CHECK ADD  CONSTRAINT [FK__HE141223_HA__UID__1DE57479] FOREIGN KEY([UID])
REFERENCES [dbo].[HE141223_HAILD_USER] ([UID])
GO
ALTER TABLE [dbo].[HE141223_HAILD_FAVORITES] CHECK CONSTRAINT [FK__HE141223_HA__UID__1DE57479]
GO
ALTER TABLE [dbo].[HE141223_HAILD_SONG]  WITH CHECK ADD FOREIGN KEY([idAlbum])
REFERENCES [dbo].[HE141223_HAILD_ALBUM] ([idAlbum])
GO
ALTER TABLE [dbo].[HE141223_HAILD_SONG]  WITH CHECK ADD FOREIGN KEY([idArtist])
REFERENCES [dbo].[HE141223_HAILD_ARTIST] ([idArtist])
GO
ALTER TABLE [dbo].[HE141223_HAILD_SONG]  WITH CHECK ADD  CONSTRAINT [FK__HE141223___idGen__20C1E124] FOREIGN KEY([idGenre])
REFERENCES [dbo].[HE141223_HAILD_GENRE] ([idGenre])
GO
ALTER TABLE [dbo].[HE141223_HAILD_SONG] CHECK CONSTRAINT [FK__HE141223___idGen__20C1E124]
GO
