- Customer Projesi Yarat

    - Web

    - Validation

    - Actuator

- Customer Objesi Oluştur

    - customerId

    - name

    - surname

    - username

    - password

    - height

    - weight

    - birthdate

- ApplicationInfo Objesi Oluştur

    - description

    - version

    - syncPeriod

    - allowedTPS1

    - retryEnabled

    - List<Customer> defaultCustomers

- ApplicationInfo objesini property e map et ve açılışta yüklenmesini sağla

    - @ConfigurationProperties

- ApplicationInfoController yaz

    - ApplicationInfo dışarıya json olarak ver

- CustomerQueryController yaz

    - getCustomer methodu --> id alacak varsa Customer dönecek

    - getCustomerByNameAndSurname --> name ve surname al ve Customer ı dön