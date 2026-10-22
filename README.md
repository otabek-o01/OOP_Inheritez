# Java OOP 
# Uyga vazifa inhertizdan misol ishlab kelish 
# Founder : Rahimjonov Otabek
# 
# Year : 18.11.2009
# Nomer : 91 132 11 18 
#
# Mavzu haqida qisqacha tushuntirish 🟢 >>>>> 
# Inheritz bir bola  bu meros ota klass qilib oladi ularni qayta yozmasdan ishlata olish muqolbildir
# yani bir zavot faras qilib olsek u zavot mashina chiqaradi 
# birinchi bo'lib mashinaga kerakli zapchaslar olib kelinadi bu ota klass bo'ladi 
# keyin extends qilib zapchaslardi joylashtiradi 
# keyin moshina ichiga bolt gaykalar qo'yiladi lekin ota klass bu ko'rmaydi chunki bu moshinani ichida turadi ha protecd esa maytafoni o'rindig'i va boshqa joylarini ota klass ko'radi 
# O'rtasiga kelganda super () key bilan chaqirilib oladi hama joyi to'g'rimi deb yoki super.CarMake() key bilan murojat qiladi 
     public BankPremium(double SavingsAccount) {
        super(SavingsAccount);
        this.PremiumAccount = 0.10;
    }
# oxiri moshina zavotdan chiqishidan ldin @Override qilininadi chunki moshina qayeridur qatiq qatirlmagani yoki ishkameydigon joyni topish uchun @Override bo'lmasa error xato berdi o'zida method da chunki tekshiruvdan o'tmagan bo'ladi 
# oxiri esa moshina do'konlariga oborib moshinalar joyiga joylaydi is - a BMW , Audi turimi >> Ha bo'lsa yoniga qo'yilida yo'q bo'lsa BMW moshinalar joyiga qo'yadi 
