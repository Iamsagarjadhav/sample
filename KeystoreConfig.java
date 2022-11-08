#psudo code

Public class KeystoreConfig
{
   KeyStore crateKeyStore(String encodedStr,
  char [] pwd)
 
byte [] decodedByteArr = Base64.getDecoder().decode(encodedStr.getBytes("UTF-8)
InputStream inputStream = new ByteArrayStream(
decodedByteArr);
KeyStore keyStore = KeyStore.getInstance("JKS");
KeyStore.load(inputStream,pwd);
return keyStore;
}
