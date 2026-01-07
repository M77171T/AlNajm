      - name: بناء نسخة ويندوز (.exe)
        run: |
          # سنقوم بطلب تجاهل فحص Berkeley DB أو استخدام الخيار المتوافق
          ./configure --host=x86_64-w64-mingw32 \
                      --enable-static \
                      --disable-shared \
                      --without-gui \
                      --without-miniupnpc \
                      --with-incompatible-bdb \
                      --disable-tests \
                      --disable-bench
          
          # الآن نبدأ البناء الفعلي
          make -j$(nproc)
